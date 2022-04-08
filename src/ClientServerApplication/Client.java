package ClientServerApplication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Client Started!!");
        Socket socket = new Socket("127.0.0.1",22222);
        System.out.println("Client Connected!!");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        //Sent to Server...

        oos.writeObject(message);

        // receive from server...

        Object fromServer = ois.readObject();
        System.out.println("From Server : "+(String)fromServer);


    }

}
