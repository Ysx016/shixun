package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("10.10.25.191",8080);
			OutputStream os=s.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			pw.write("�û�����annie�����룺1111");
			pw.flush();
			s.shutdownOutput();
			
			InputStream is=s.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String info=" ";
			while((info=br.readLine())!=null) {
				System.out.println("���ǿͻ��ˣ�������˵��"+info);
			}
			br.close();
			pw.close();
			is.close();
			os.close();
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
