package Reaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//Hero h=new Hero();
		//h.name="lisa";
		//System.out.println(h.name);
		try {
			Class pClass=Class.forName("Reaction.Hero");
			Constructor c=pClass.getConstructor(null);
			Hero h1=(Hero)c.newInstance(null);
			h1.name="bad";
			System.out.println(h1.name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
