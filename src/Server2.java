/* Client Server message passing using socket */

/* Server side socket */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String args[]) throws Exception {
        int port = 8888;
        String str;
        ServerSocket srvSocket = new ServerSocket(port);
        System.out.println("Waiting for a connection on " + port);
        Socket clntSocket = srvSocket.accept();
        PrintWriter pw = new PrintWriter(clntSocket.getOutputStream(), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(clntSocket.getInputStream()));

        /* Receive message from client */
        while ((str = br.readLine()) != null) {
            System.out.println("Client message: " + str);

            /* Send message to client */
            if (str.equals("Bye")) {
                pw.println("Bye");
                break;
            }
            else
                pw.println(str);
        }
        pw.close();
        br.close();
        clntSocket.close();
    }
}
