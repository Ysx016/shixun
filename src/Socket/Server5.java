package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(8080);
			int count=0;
			System.out.println("----�����������������ȴ��ͻ�����----");
			while(true) {
				Socket s=ss.accept();
				ServerThread st=new ServerThread(s);
				st.start();
				count++;
				System.out.println("�ͻ��˵�����"+count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
