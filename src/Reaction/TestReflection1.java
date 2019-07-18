package Reaction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection1 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Hero h=new Hero();
		h.setName("sally");
		System.out.println(h.getName());
		
		try {
			Method m=h.getClass().getMethod("setName", String .class);
			m.invoke(h, "lisa");
			System.out.println(h.getName());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
