package ClientServerApplication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Server {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server Started!!");

        while (true)
        {
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected!!");

            ObjectInputStream Ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream Oos = new ObjectOutputStream(socket.getOutputStream());


               Object cMsg = Ois.readObject();
               System.out.println("From Client : "+(String)cMsg);
               String serverMsg = (String) cMsg;

               serverMsg = serverMsg.toUpperCase();
               Oos.writeObject(serverMsg);
        }
    }
}
