package Practice2;
import java.util.*;
public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String str1="apple";
		String str2=null;
		method1(str1,str2);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}

	private static void method1(String str1 ,String str2) {
		// TODO Auto-generated method stub

		if(null==str1||null==str2){
			throw new NullPointerException();
		}
		else{
			System.out.println(str1.compareToIgnoreCase(str2));
		}
	}
}
