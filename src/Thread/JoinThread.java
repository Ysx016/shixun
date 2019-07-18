package Thread;

public class JoinThread extends Thread{
	public void run() {
		
			for(int i=0;i<20;i++) {
				System.out.println("-----join-----"+i);
			}

	}

}
