package Thread;

public class TestSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleeping s=new Sleeping();
		s.start();
		for(int i=0;i<20;i++) {
			System.out.println("Main"+i);
		}

	}

}
