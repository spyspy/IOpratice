import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) throws IOException {
		// Step 0 create serverSocket
		System.out.println("---Begin of Server------");
		int srvPort = 5001;
		ServerSocket srvSocket = new ServerSocket(srvPort);
		System.out.println("server started at port: "+srvPort);
		//Step 2 Accept socket
		Socket socket = srvSocket.accept();
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String data = br.readLine();
		System.out.println("recevid "+data);
		is.close();
		System.out.println("---End of Server------");

	}

}
