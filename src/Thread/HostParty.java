package Thread;

public class HostParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakingDumplings m2=new MakingDumplings();
		MakingPeanuts m1=new MakingPeanuts();
		Thread t1=new Thread(m2);
		Thread t2=new Thread(m1);
		t1.start();
		t2.start();
		for(int i=0;i<30;i++) {
			System.out.println("¿ÍÈË"+i+"£ºÇë½ø");
		}

	}

}
