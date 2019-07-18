package Practice2;
import java.io.*;
public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/lol2.txt");
		try{
			FileOutputStream fos=new FileOutputStream(f);
			byte date[]= {88,89};
			
			fos.write(date);
			 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
