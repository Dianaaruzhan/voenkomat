import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
public class Main {
    public static MainFrame frame;
    public static Person user;
    public static Med user_med;
    public static Pt user_pt;
    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
    }
    public static void connect(Packet p) {
        try {
            Socket socket = new Socket("127.0.0.1", 2001);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            if (p.getCode().equals("ADD")) {
                oos.writeObject(p);
            }
            else if(p.getCode().equals("LIST_RESULT")){
                oos.writeObject(p);
                Packet infoFroMServer = (Packet) ois.readObject();
                ArrayList<Resultablica> resu = infoFroMServer.getRestabb();
                String s = "";
                for(int i=0;i<resu.size();i++){
                    s+=resu.get(i).toString()+"\n";
                    System.out.println(s);
                }
                Result.tarea.append(s);
            }else if (p.getCode().equals("ADD_USER")){
                oos.writeObject(p);
            } else if (p.getCode().equals("SIGN_IN")){
                oos.writeObject(p);
                Packet info = (Packet)ois.readObject();
                Main.user = info.getPerson();
            } else if (p.getCode().equals("ADD_FINAL")) {
                oos.writeObject(p);
            }else if (p.getCode().equals("UPDATE_UPS")) {
                oos.writeObject(p);
            }
//            else if(p.getCode().equals("List")){
//                oos.writeObject(p);
//                Packet FromServer = (Packet) ois.readObject();
//                ArrayList <Person> ArrayListFromServer = FromServer.getPersons();
//
//                String s = "";
//                for(int i=0;i<ArrayListFromServer.size();i++){
//                    s+=ArrayListFromServer.get(i)+"\n";
//                }
//                Result.tarea.append(s);
//            }
            oos.close();
            ois.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Person personss[] = new Person[100];
    public static int count = 0;
    public static void addPerson(Person p) {
        personss[count] = p;
        count++;
    }
}
//    public static Medicine2 med[] = new Medicine2[100];
//    public static int count1 = 0;
//    public static void addMedicine2 (Medicine2 md){
//        med[count] = md;
//        count++;
//    }