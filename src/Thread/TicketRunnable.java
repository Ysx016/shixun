package Thread;

public class TicketRunnable implements Runnable{

	public void run() {
		System.out.println("进票");
		for(int i=0;i<=50;i++) {
			System.out.println("客人"+i+"买票");
		}
		System.out.println("票卖完了");
	}

}