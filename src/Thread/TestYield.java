package Thread;

public class TestYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThread t=new YieldThread("y1");
		YieldThread t1=new YieldThread("y2");
		t.start();
		t1.start();
		}


	}


