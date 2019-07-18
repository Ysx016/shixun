package Reaction;

public class TestReaction {

	public static void main(String[] args) {
		String className="Reaction.Hero";
		try {
			Class pClass=Class.forName(className);
			Class pClass2=Hero.class;
			Class pClass3=new Hero().getClass();
			
			System.out.println(pClass==pClass2);
			System.out.println(pClass==pClass3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
