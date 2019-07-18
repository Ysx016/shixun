package Thread;

public class TicketThread extends Thread{
	private int tickets=50;
	public void run() {
		while(true) {
			if(tickets>0) {
				int sum=tickets-1;
				System.out.println(Thread.currentThread().getName()+" is sailing tickets"+(sum));
			}else {
				break;
			}
		}
	}

}
