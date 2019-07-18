package tool;
import java.util.*;
public class FanXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> m1=new HashMap<>();
		List l1=new ArrayList();
		List l2= new ArrayList();
		List l3=new ArrayList();
		l1.add("Ð¡ºì");
		l1.add("1000");
		l2.add("Ð¡À¼");
		l2.add("0");
		l3.add("Ð¡»Æ");
		l3.add("100");
		m1.put("111",l1);
		m1.put("222",l2);
		m1.put("333", l3);
		

		String id=new Scanner(System.in).nextLine();
		
		if(m1.containsKey(id)) {
			
			List l4=new ArrayList(m1.get(id));
			System.out.println(l4.get(1));
			}
		
		
	}

}


