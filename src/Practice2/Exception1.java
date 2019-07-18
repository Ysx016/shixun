package Practice2;

public class Exception1 {
	static int arr[]=new int[3];
	
	public static void main(String[] args) {
		methodOne();System.out.println("main");
	}

	private static void methodOne() {
		// TODO Auto-generated method stub
		methodTwo();
		System.out.println("one");
	}

	private static void methodTwo() {
		// TODO Auto-generated method stub
		methodThree();
		System.out.println("Two");
	}

	private static void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("Three");
		System.out.println(arr[2]);
		
	}

}
