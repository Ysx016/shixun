package Thread;

public class Thread3 extends Thread{

	public void run() {
		if(getPriority()==10) {
			for(int i=0;i<=200;i++) {
				System.out.println("�߳�1��������");
			}
		}else {
			for(int i=0;i<=200;i++) {
				System.out.println("�߳�2��������");
			}
		}
		
	}

}
