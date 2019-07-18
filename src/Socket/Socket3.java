package Socket;
import java.io.IOException;
import java.net.*;
public class Socket3 {

	 
	// TODO Auto-generated method stub
		String hostName;
		int port;
		InetAddress a;
		
		public Socket3(String hostName, int port) {
		
		this.hostName = hostName;
		this.port = port;
	}
		
		public Socket3(int port, InetAddress a) {
			
			this.port = port;
			this.a = a;
		}
		public static void main(String[] args) {
			try {
				Socket s=new Socket("mary",700);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	

}
