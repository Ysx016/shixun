package Socket;
import java.io.*;
import java.net.*;
public class Server1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("监听在读口号：8888");
			Socket s=ss.accept();
			System.out.println("有连接过来"+s);
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
