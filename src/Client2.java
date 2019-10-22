/* Client side socket */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2{
    public static void main(String args[]) throws Exception {
        String host = "127.0.0.1";
        String str;
        Socket sckt = new Socket(host, 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(sckt.getInputStream()));
        PrintWriter pw = new PrintWriter(sckt.getOutputStream(), true);

        /* Send message to server */
        pw.println("Connected");
        pw.println("Hello");

        /* Receive message from server */
        while ((str = br.readLine()) != null) {
            System.out.println("Server message: "+str);
            pw.println("Bye");
            if (str.equals("Bye"))
                break;
        }
        br.close();
        pw.close();
        sckt.close();
    }
}