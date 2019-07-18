package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket s1 = new Socket("127.0.0.1",7888);
			OutputStream os=s1.getOutputStream();
			os = s1.getOutputStream();
			os.write(111);
			os.close();
			s1.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
