package Thread;

public class MakingPeanuts implements Runnable{
	public void run() {
		System.out.println("花生：和面");
		System.out.println("花生：和馅");
		for(int i=0;i<=30;i++) {
			System.out.println("花生：擀饺子皮");
			System.out.println("花生：包饺子");
		}
		System.out.println("花生：吃花生");
	}

}
