import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[]args){
        try {
            Socket s = new Socket("localhost", 2001);

            System.out.println("Client side");
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());

            Scanner in = new Scanner(System.in);
            String str = "";
            while(true){
                System.out.print("massega: ");
                str = in.nextLine();

                oos.writeObject(str);

                if(str.equals("exit"))
                    break;

                str = (String)ois.readObject();
                System.out.println("server: " + str);
            }

//            String str = "hello";
//            oos.writeObject(str);
//
//            String s2 = (String)ois.readObject();
//            System.out.println("message from server: " + s2);

            ois.close();
            oos.close();

        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}