import java.io.*;
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
		System.out.println("socket.getInputStream()");
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("br.readLine()");

		String data = "";
		int count = 0;

		while ((data = br.readLine()) != null) {
			count++;
			data += br.readLine();
			System.out.println(count);
		}

		System.out.println("received "+data);
		is.close();
		pw.close();
		socket.close();
		System.out.println("---End of Server------");

	}

}
