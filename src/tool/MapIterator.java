package tool;
import java.util.*;
public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put("1","aaa");
		m1.put("2", "bbb");
		m1.put("3", "ccc");
		Set keys=m1.keySet();
		Iterator keys1=keys.iterator();
		while(keys1.hasNext()) {
			String k=(String)keys1.next();
			System.out.println(k);
			System.out.println(m1.get(k));
		}
	}

}
