package Thread;

public class Timer {
	private static int num=0;
	public synchronized void add(String name) {
		num++;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"���ǵ�"+num+"��ʹ��timer���߳�");
	}

}
