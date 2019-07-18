package Thread;

public class Thread3 extends Thread{

	public void run() {
		if(getPriority()==10) {
			for(int i=0;i<=200;i++) {
				System.out.println("线程1正在运行");
			}
		}else {
			for(int i=0;i<=200;i++) {
				System.out.println("线程2正在运行");
			}
		}
		
	}

}
