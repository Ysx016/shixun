package tool;

import java.util.LinkedList;

public class Queue extends LinkedList{
	
		public void Queue() {}
		public void put(Object o) {
			this.addLast(o);
			
			
		}
		public Object get() {
			Object o=this.getFirst();
			this.removeFirst();
			return o;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.put("one");
		q.put("two");
		q.put("four");
		q.put("three");
		
		System.out.println(q);
		System.out.println(q.get());
		
		

	}
}



