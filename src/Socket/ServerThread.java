package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	Socket socket =null;
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader be=null;
		OutputStream os=null;
		PrintWriter pw=null;
		
		try {
			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String info=" ";
			while((info=br.readLine())!=null) {
				System.out.println("���Ƿ��������ͻ���˵��"+info);
			}
			socket.shutdownInput();
			os=socket.getOutputStream();
			pw=new PrintWriter(os);
			pw.write("��ӭ����");
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null!=pw) {
				pw.close();
			}
			
				try {
					if(null!=os) {
					os.close();}
					if(null!=be) {
						be.close();
					}if(null!=is) {
						is.close();
					}if(null!=isr) {
						isr.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


