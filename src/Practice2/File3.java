package Practice2;
import java.io.*;
import java.util.*;
public class File3 {
	/**C:WINDOWSĿ¼���������Ŀ¼�µ������ļ������ñ�����Ŀ¼��
	�ҳ��ļ������ĺ���С�ģ�����ӡ���ļ���
	��С���ļ�������0����
	
*/
	//����1������һ���ļ�����
	//2.ʹ��listFiles()��ȡ��Ŀ¼�������ļ��Լ��ļ���
	//3.ѭ���ļ����飬�ж��Ƿ����ļ�
	//for(File file:f){
	//file.isFile()}
	//4.��ѭ���бȽ��ļ���Сlength()
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
		System.out.println("�����ļ��ǣ�"+maxFile.getAbsolutePath()+"������Ϊ��"+maxSize);
		System.out.println("��С���ļ��ǣ�"+minFile.getAbsolutePath()+"������Ϊ��"+minSize);
	}
}
