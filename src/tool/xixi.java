package tool;
import java.util.*;
public class xixi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s =new HashSet();
		for(int i=0;i<=6;i++) {
			s.add(i);
		}
		List l=new ArrayList(); 
		ListIterator it=l.listIterator();
			
			while(it.hasPrevious()) {
				System.out.println(it.previous());
				it.remove();
			}
		System.out.println(s);
	}

}
