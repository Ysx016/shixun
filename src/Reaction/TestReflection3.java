package Reaction;

import java.lang.reflect.Field;

public class TestReflection3 {

	public static void main(String[] args) throws  SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Hero h=new Hero();
		try {
			Class pClass =Class.forName("Reaction.Hero");
			Field f1=pClass.getDeclaredField("name");
			f1.set(h, "aaa");
			System.out.println(h.name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
