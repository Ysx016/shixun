package tool;
import java.util.*;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set s1=new HashSet();
		Set s2=new HashSet();
		
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s2.add("d");
		s2.add("a");
		s2.add("b");
		
		Set sn=new HashSet(s1);
		System.out.println(sn);
		sn.retainAll(s2);//只留下两者中相同的元素,相当于取交集
		System.out.println(sn);
		
		Set su=new HashSet(s1);
		su.addAll(s2);//相当于取并集
		System.out.println(su);*/
		
		/*List list1=new ArrayList();
		list1.add("aaa");
		list1.add("bbb");
		list1.add(new Integer(11));
		System.out.println(list1.get(0));
		list1.get(0);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}*/
		
		
				List l= new LinkedList();
				for(int i=0;i<=5;i++) {
					l.add(i);
				
				}
				System.out.println(l);
				l.add(3,"a100");
				System.out.println(l);
				l.set(4, "qq");
				System.out.println(l);
				System.out.println(l.get(5));
				System.out.println(l.indexOf("a10"));
				l.remove("a100");
				System.out.println(l);

	}

}
