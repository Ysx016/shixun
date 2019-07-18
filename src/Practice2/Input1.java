package Practice2;
import java.util.*;
public class Input1 {
	
	public static void main(String[] args) {
		List l2=new ArrayList();
		l2.add("apple");
		l2.add("grape");
		l2.add("banana");
		l2.add("pear");
		for(int i=0;i<=l2.size();i++) {
			for(int k=0;k<=l2.size();k++) {
				String str2=l2.get(i).toString();
				String str3=l2.get(k).toString();
				if(str2.compareTo(str3)>0) {
					String temp=str2;
					l2.set(i, l2.get(k).toString());
					l2.set(k, temp);
				}
			}
				
			}
		System.out.println("最大字符串为"+l2.get(0)+",最小字符串为："+l2.get(3));
		}
		
	}
	


