package tool;

public class Exception_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			badMethod();
			System.out.print("A");
			
		}catch(RuntimeException ex) {
			System.out.print("B");}
		catch(Exception ex1) {
			System.out.println("C");
		}
		finally {
		
		System.out.print("D");
	}
		System.out.print("E");
		}
	public static void badMethod() {
		throw new RuntimeException();
		}
	}
