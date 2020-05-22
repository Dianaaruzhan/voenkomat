import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            String str = "";
            while(true){
                str = (String)ois.readObject();
                if(str.equals("exit"))
                    break;

                if(str.equals("hello") || str.equals("hi"))
                    oos.writeObject("how are you?");
                else
                if(str.equals("ok"))
                    oos.writeObject("i am ok too");
                else
                    oos.writeObject("i don't understand you");
            }
            ois.close();
            oos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}