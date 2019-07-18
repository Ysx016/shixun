package Practice2;
import java.io.*;
public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/lol.txt");
		try {
			FileReader fr=new FileReader(f);
			char[] c=new char[(int)f.length()];
			
				fr.read(c);
				System.out.println(c);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
