package Practice2;

import java.io.*;

public class Stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/lol2.txt");
		try {
			FileWriter fw=new FileWriter(f);
			String date="sdsdd233";
			char[] c=date.toCharArray();
			fw.write(c);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
