package Socket;
import java.io.*;
import java.net.*;
public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("127.0.0.1",8888);
			System.out.println(s);
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
