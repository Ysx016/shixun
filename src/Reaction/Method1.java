package Reaction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Method1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	String str="helloworld";
	Class c=str.getClass();

	try {
		Method m = c.getMethod("substring", int.class);
		Object o = m.invoke(str, 2);
		System.out.println(o);
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
