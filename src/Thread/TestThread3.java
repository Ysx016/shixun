package Thread;

public class TestThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t1=new Thread3();
		Thread3 t2=new Thread3();
		t1.setPriority(10);
		t2.setPriority(6);
		t2.start();
		t1.start();

	}

}
