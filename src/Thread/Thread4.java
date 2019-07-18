package Thread;

import java.util.Date;

public class Thread4 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) 
		{
			try {
				sleep(1000);
				Date date=new Date();
				System.out.println(date);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

}
