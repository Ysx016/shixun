package Reaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class ClassUtil {
	//打印类的信息，包括类的成员函数、成员变量
	public static void printClassMethodMessage(Object obj) {
		Class c=obj.getClass();
		System.out.println("类的名称"+c.getName());
		Method[] ms=c.getMethods();
		for(int i=0;i<ms.length;i++) {
			//得到方法的返回值类型的类类型
			Class returnType=ms[i].getReturnType();
			System.out.println("返回值类型"+returnType.getName());
			//得到方法的名称
			System.out.println("方法的名称"+ms[i].getName());
			//得到参数列表的类的类类型
			Class[] paramTypes=ms[i].getParameterTypes();
			for(Class class1:paramTypes) {
				System.out.println(class1.getName()+",");
			}
		}

	}
	//获取成员变量的信息
	public static void printCLassFieldMessage(Object obj) {
		Class c=obj.getClass();
		Field[] fs=c.getDeclaredFields();
		for(Field field:fs) {
			//得到成员变量的类型的类类型
			Class fieldType=field.getType();
			String typeName=field.getName();
			System.out.println("成员变量的类型"+typeName);
			//得到成员变量的名称
			String fieldName=field.getName();
			System.out.println("成员变量的名称"+fieldName);
		}
}
	public static void printClassConstructerMessage(Object obj) {
		Class c=obj.getClass();
		Constructor[] cs=c.getConstructors();
		for(Constructor constructor:cs) {
			//获取构造函数的参数列表的类类型
			Class[] paramType=constructor.getParameterTypes();
			System.out.println("构造函数的参数列表："+paramType);
			String csName=constructor.getName();
			System.out.println("构造函数的名称："+csName);
		}
	}

}
