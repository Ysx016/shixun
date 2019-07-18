package Reaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class ClassUtil {
	//��ӡ�����Ϣ��������ĳ�Ա��������Ա����
	public static void printClassMethodMessage(Object obj) {
		Class c=obj.getClass();
		System.out.println("�������"+c.getName());
		Method[] ms=c.getMethods();
		for(int i=0;i<ms.length;i++) {
			//�õ������ķ���ֵ���͵�������
			Class returnType=ms[i].getReturnType();
			System.out.println("����ֵ����"+returnType.getName());
			//�õ�����������
			System.out.println("����������"+ms[i].getName());
			//�õ������б�����������
			Class[] paramTypes=ms[i].getParameterTypes();
			for(Class class1:paramTypes) {
				System.out.println(class1.getName()+",");
			}
		}

	}
	//��ȡ��Ա��������Ϣ
	public static void printCLassFieldMessage(Object obj) {
		Class c=obj.getClass();
		Field[] fs=c.getDeclaredFields();
		for(Field field:fs) {
			//�õ���Ա���������͵�������
			Class fieldType=field.getType();
			String typeName=field.getName();
			System.out.println("��Ա����������"+typeName);
			//�õ���Ա����������
			String fieldName=field.getName();
			System.out.println("��Ա����������"+fieldName);
		}
}
	public static void printClassConstructerMessage(Object obj) {
		Class c=obj.getClass();
		Constructor[] cs=c.getConstructors();
		for(Constructor constructor:cs) {
			//��ȡ���캯���Ĳ����б��������
			Class[] paramType=constructor.getParameterTypes();
			System.out.println("���캯���Ĳ����б�"+paramType);
			String csName=constructor.getName();
			System.out.println("���캯�������ƣ�"+csName);
		}
	}

}
