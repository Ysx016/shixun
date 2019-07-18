package Practice2;
import java.io.*;
import java.util.*;
public class File3 {
	/**C:WINDOWS目录，遍历这个目录下的所有文件（不用遍历子目录）
	找出文件中最大的和最小的，并打印出文件名
	最小的文件不能是0长度
	
*/
	//步骤1：创建一个文件对象
	//2.使用listFiles()获取该目录下所有文件以及文件夹
	//3.循环文件数组，判断是否是文件
	//for(File file:f){
	//file.isFile()}
	//4.在循环中比较文件大小length()
	public static void main(String[] args) {
		File f=new File("C:/WINDOWS");
		long maxSize=0;
		long minSize=Integer.MAX_VALUE;
		File maxFile=null;
		File minFile=null;
				
		File[] f1=f.listFiles();
		
		for(File file:f1) {
			if(file.isFile()) {
				if(file.length()>maxSize) {
					maxSize=file.length();
					maxFile=file;
				}
				if(file.length()!=0&&file.length()<minSize) {
					minSize=file.length();
					minFile=file;
				}
				
			}
		}
		System.out.println("最大的文件是："+maxFile.getAbsolutePath()+"，长度为："+maxSize);
		System.out.println("最小的文件是："+minFile.getAbsolutePath()+"，长度为："+minSize);
	}
}
