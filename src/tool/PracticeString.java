package tool;
import java.util.*;
public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=new Scanner(System.in).nextInt();
		String s=numberToStringNew(input);
		System.out.println(s);
	}
	private static String numberToStringNew(int number) {
		String numberString=String.valueOf(number);
		if(number<10) {
			numberString="00"+numberString;
		
		}
		else if(number<100) {
			numberString="0"+numberString;
		}
		return numberString;
	}

}
