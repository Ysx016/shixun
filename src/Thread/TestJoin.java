package Thread;

public class TestJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread t=new JoinThread();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<20;i++) {
			System.out.println("----Main----"+i);
		}

	}

}
