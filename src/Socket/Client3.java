package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket s = new Socket("127.0.0.1",6666);
			OutputStream os=s.getOutputStream();
			DataOutputStream dos =new DataOutputStream(os);
			dos.writeUTF("hello server!");
			dos.flush();
			dos.close();
			os.close();
			s.close();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
