package tool;
import java.util.*;
public class PracticeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put(1,"aaa");
		m1.put(2, "bbb");
		m1.put(3, "ccc");
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.containsKey(1));
		System.out.println(m1.containsValue("bbb"));
		
		Map m2=new HashMap();
		m2.put("one","111");
		m2.put("two", "222");
		m2.put("three","333");
		
		Map m3=new HashMap(m1);
		System.out.println(m3);
		m2.putAll(m3);
		System.out.println(m2);
	}

}
