import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// step 0 create socket to connect serv
		System.out.println("---Begin of Clinet------");
		String host = "127.0.0.1";
		int port = 5001;
		Socket socket = new Socket(host, port);
		System.out.println("connected");
		OutputStream os = socket.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		
		String data = "Apple";
		bw.write(data);
		System.out.println("sent "+data);
		os.close();
		System.out.println("socket:"+socket);
		System.out.println("---End of Clinet------");

	}

}
