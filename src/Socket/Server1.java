package Socket;
import java.io.*;
import java.net.*;
public class Server1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("�����ڶ��ںţ�8888");
			Socket s=ss.accept();
			System.out.println("�����ӹ���"+s);
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
