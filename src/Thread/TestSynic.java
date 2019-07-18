package Thread;

public class TestSynic implements Runnable{
	Timer timer=new Timer();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSynic test=new TestSynic();
		Thread t1=new Thread(test);
		Thread t2=new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}
	public void run() {
		timer.add(Thread.currentThread().getName());
	}

}