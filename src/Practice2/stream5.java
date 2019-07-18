package Practice2;
import java.io.*;
public class stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*文件加密，准备一个文本文件，其中包含ASCII码的字符和中文字符
 * void encodeFile(File encodeingFile,File encodeFile)
 **加密后，把文件保存到encode文件中，加密算法：数字：不是9，在原来的基础上加1,5变成6，如果是9变成0；
 **字母字符：不是z，向右移动一个，a变为b，z变为a，保留大小写
 ** 非字母字符，不变，中文不变
 */
		File encodeingFile=new File("D:/lol.txt");
		File encodedFile=new File("D:/lol.txt");
		encodeFile(encodeingFile,encodedFile);}
		
		private static void encodeFile(File encodeingFile, File encodedFile) {
			try (FileReader fr=new FileReader(encodeingFile);
			FileWriter fw =new FileWriter(encodedFile)){
				char[] c=new char[(int)encodeingFile.length()];
				fr.read(c);
				System.out.println("加密前的内容："+new String(c));
				encode(c);
				System.out.println("加密后的内容："+new String(c));
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
