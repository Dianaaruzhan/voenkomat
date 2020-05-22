import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.ResultSet;
import java.util.ArrayList;
public class ServerThread extends Thread {
    private Socket socket;
    public ServerThread(Socket socket){
        this.socket = socket;
    }
    public void run(){
        try{
            DataBase db = new DataBase();
            db.getDbconnection();
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Packet packet = null;
            System.out.println("Client connected");
            try{
                while((packet = (Packet)inputStream.readObject())!=null){
                    if(packet.getCode().equals("ADD_FINAL")){
                        Person personFromClient = packet.getPerson();
                        Med medFromClient = packet.getMed();
                        Pt ptFromClient = packet.getPt();
                        db.add(personFromClient, medFromClient,ptFromClient);
                    }
                    else if(packet.getCode().equals("LIST_RESULT")){
                        ArrayList<Resultablica> results = new ArrayList<>();
                        ResultSet list = db.getResults();
                        while (list.next()) {
                            Resultablica rs = new Resultablica();
                            rs.setAge(list.getInt("age"));
                            rs.setName(list.getString("name"));
                            rs.setSurname(list.getString("surname"));
                            rs.setRegion(list.getString("region"));
                            rs.setId_person(list.getString("id_person"));
                            results.add(rs);
                        }
                        Packet data = new Packet(results);
                        outputStream.writeObject(data);
                    }
                    else if(packet.getCode().equals("ADD_USER")){
                        Person personFromClient = packet.getPerson();
                        db.add(personFromClient);
                    }
                    else if (packet.getCode().equals("SIGN_IN")) {
                        Person person = new Person();
                        ResultSet infoClient = db.getUser(packet.getPerson());
                        while (infoClient.next()) {
                            person.setId(infoClient.getString("id"));
                            person.setAge(infoClient.getInt("age"));
                            person.setName(infoClient.getString("name"));
                            person.setSurname(infoClient.getString("surname"));
                            person.setRegion(infoClient.getString("region"));
                        }
                        Packet data = new Packet(person);
                        outputStream.writeObject(data);
                    }else if(packet.getCode().equals("UPDATE_UPS")){
                        Resultablica res = packet.getRestab();
                        db.add(res);
                    }
                }
            }catch (EOFException ignored){
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}