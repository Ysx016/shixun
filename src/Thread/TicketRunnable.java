package Thread;

public class TicketRunnable implements Runnable{

	public void run() {
		System.out.println("��Ʊ");
		for(int i=0;i<=50;i++) {
			System.out.println("����"+i+"��Ʊ");
		}
		System.out.println("Ʊ������");
	}

}