package Practice2;
import java.io.*;
public class FileClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/lol.txt");
		try (FileInputStream fls=new FileInputStream(f)){
			byte[] b=new byte[(int)f.length()];
			fls.read(b);
			for(byte byt:b) {
				System.out.println(byt);
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		

	}

}
