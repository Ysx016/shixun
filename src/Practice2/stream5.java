package Practice2;
import java.io.*;
public class stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*�ļ����ܣ�׼��һ���ı��ļ������а���ASCII����ַ��������ַ�
 * void encodeFile(File encodeingFile,File encodeFile)
 **���ܺ󣬰��ļ����浽encode�ļ��У������㷨�����֣�����9����ԭ���Ļ����ϼ�1,5���6�������9���0��
 **��ĸ�ַ�������z�������ƶ�һ����a��Ϊb��z��Ϊa��������Сд
 ** ����ĸ�ַ������䣬���Ĳ���
 */
		File encodeingFile=new File("D:/lol.txt");
		File encodedFile=new File("D:/lol.txt");
		encodeFile(encodeingFile,encodedFile);}
		
		private static void encodeFile(File encodeingFile, File encodedFile) {
			try (FileReader fr=new FileReader(encodeingFile);
			FileWriter fw =new FileWriter(encodedFile)){
				char[] c=new char[(int)encodeingFile.length()];
				fr.read(c);
				System.out.println("����ǰ�����ݣ�"+new String(c));
				encode(c);
				System.out.println("���ܺ�����ݣ�"+new String(c));
				fw.write(c);
			}catch(IOException e) {
				
			}
		}private static void encode(char[] c) {
			for(int i=0;i<c.length;i++) {
				char ch=c[i];
				if(isLetterOrDigit(ch)) {
					switch(ch) {
					case'9':
						ch='0';
						break;
					case'z':
						ch='a';
						break;
					case'Z':
						ch='A';
						break;
						default:
							ch++;
							break;
				}
			}c[i]=ch;
		}
	}
	private static boolean isLetterOrDigit(char ch) {
		String str="287398hedw";
		return -1==str.indexOf(ch)?false:true;
	}
		
	

}
