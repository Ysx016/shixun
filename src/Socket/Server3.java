package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		
		System.out.println(dis.readUTF());
		System.out.println("hello client!"+s.getInetAddress()+":"+s.getLocalPort());
		dis.close();
		s.close();
		ss.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
