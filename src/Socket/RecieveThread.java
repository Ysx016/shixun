package Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class RecieveThread extends Thread{
	private Socket s;
	public RecieveThread(Socket s) {
		this.s=s;
	}
	public void run() {
		InputStream is=null;
		DataInputStream dis=null;
		try {
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			while(true) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.println();
		}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
