package Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ServerSocket ss=new ServerSocket(8888);
		System.out.println("-----����������------");
		Socket s=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		System.out.println("�ͻ��˷��͵���Ϣ��"+str);
		br.close();
		s.close();
		ss.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
