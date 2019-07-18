package tool;
import java.util.*;
public class HashmapAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Account> m=new HashMap<>();
		Account ac=new Account("A0001","ÁõÓíÍ¢",1000);
		Account ac1=new Account("A0002","ÎâÄ¾Áé",1200);
		Account ac2=new Account("A0003","ĞÜ¼ÌæÂ",14000);
		
		m.put("A0001",ac);
		m.put("A0002",ac1);
		m.put("A0003",ac2);
		Set s1=m.keySet();
		Iterator it=s1.iterator();
		System.out.println("ÊäÈëÄúµÄID£º");
		String str1=new Scanner(System.in).nextLine();
		if(m.containsKey(str1)) {
			System.out.println("×ğ¾´µÄ"+m.get(str1).getName()+",ÄúµÄÓà¶îÎª"+m.get(str1).getBalance()+"Ôª");
		}
		

	}

}
