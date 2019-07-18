package Socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
				Socket s=new Socket("127.0.0.1",8888);
				System.out.println("-----与服务器端建立连接-----");
				Scanner sc=new Scanner(System.in);
				int[] ch=new int[](1,5,4,9);
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				bw.write(str);
				bw.flush();
				bw.close();
				s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
