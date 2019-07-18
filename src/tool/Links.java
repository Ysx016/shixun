package tool;
import java.util.*;
import java.util.LinkedList;
public class Links {
	LinkedList l;
	
	public void put(Object o) {
		l.add(o);
	}
	public boolean isEmpty() {
		if(l.isEmpty()) {
			return true;}
		else {
			return false;
			
		}
	}
	
	public Object get(int i) {
		return l.get(i);
	}
}



