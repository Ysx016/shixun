package Thread;

public class TstThread1 {
	public static void main(String[] args) {
		int i=0;
		for(i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		if(i==30){
			Thread t1=new Thread();
			Thread t2=new Thread();
			t1.start();
			t2.start();
		}
	}

}
