package Practice2;

import java.io.File;
import java.util.*;
public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/JavaFoleder/Skin");
		/*String[] s=f.list();//���ַ����������ʽ���ص�ǰ�ļ����µ������ļ������������ļ������ļ���
		System.out.println(Arrays.toString(s));
		
		File[] fi=f.listFiles();//���ļ��������ʽ����......
		System.out.println(Arrays.toString(fi));*/
		
		File[] a=f.listRoots();
		System.out.println(Arrays.toString(a));//�г�������
		f.delete();//ɾ��

	}

}
