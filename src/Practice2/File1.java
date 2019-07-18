package Practice2;
import java.io.*;
import java.util.*;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File f=new File("d:/JavaFolder/Javaok.exe");
		System.out.println("当前文件是"+f);
		System.out.println("判断文件是否存在"+f.exists());
		System.out.println("判断是否是文件夹"+f.isDirectory());
		System.out.println("判断是否是文件"+f.isFile());
		System.out.println("判断文件长度"+f.length());
		long time=f.lastModified();
		Date d=new Date(time);
		System.out.println("文件最后修改时间"+d);
		f.setLastModified(0);
		File fn=new File("d:/JavaFolder/Javaok.exe");
		f.renameTo(fn);
		
		
	}

}
