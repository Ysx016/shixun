package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(7888);
			System.out.println("监听在线口号：7888");
			Socket s=ss.accept();
			InputStream is=s.getInputStream();
			int msg=is.read();
			System.out.println("监听到"+msg);
			is.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
