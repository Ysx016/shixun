package Practice2;
import java.io.*;
import java.util.*;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File f=new File("d:/JavaFolder/Javaok.exe");
		System.out.println("��ǰ�ļ���"+f);
		System.out.println("�ж��ļ��Ƿ����"+f.exists());
		System.out.println("�ж��Ƿ����ļ���"+f.isDirectory());
		System.out.println("�ж��Ƿ����ļ�"+f.isFile());
		System.out.println("�ж��ļ�����"+f.length());
		long time=f.lastModified();
		Date d=new Date(time);
		System.out.println("�ļ�����޸�ʱ��"+d);
		f.setLastModified(0);
		File fn=new File("d:/JavaFolder/Javaok.exe");
		f.renameTo(fn);
		
		
	}

}
