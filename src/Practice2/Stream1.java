package Practice2;
import java.io.*;
import java.util.*;
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/lol.txt");
		try {
			FileInputStream fls=new FileInputStream(f);
			byte[] b=new byte[(int)f.length()];
			
			fls.read(b);
			for(byte byt:b) {
				System.out.println(byt);
			}
			fls.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
