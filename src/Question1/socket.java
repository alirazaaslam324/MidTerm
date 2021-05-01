
package Question1;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class socket {
    public static void main(String[] args)  {
        try {
            ServerSocket server_s = new ServerSocket(007);
            
            System.out.println("wait for repsonse \n\n\n");
            Socket socket_s = server_s.accept();
            System.out.println(" Connection successfully \n\n\n");
            
            DataInputStream obj_1 = new DataInputStream(socket_s.getInputStream());
            String obj2 = (String) obj_1.readUTF();
            System.out.println("Notification is  = " + obj2);
            
            server_s.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
