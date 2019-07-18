package Sushu;

public class Sushu1 extends Thread{
	public int max;
	public int min;
	public Sushu1(int min, int max) {
		
		this.max = max;
		this.min = min;
	}
	public void run() {
		
		if(min<2&&max>2) {
			System.out.println(2);
		}
		for(int i=min;i<(max+1);i+=2 ){
			int amount=0;
			for(int k=2;k<i;k++) {
				if(i%k==0) {
					amount++;
					
				}else {continue;}
			if(amount==1) {
				System.out.println(" "+i);
			}
			}
		}
	}

}
