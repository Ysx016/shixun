package tool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/lol.txt");
		try {
			FileReader fr=new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
