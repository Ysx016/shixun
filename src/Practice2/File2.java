package Practice2;

import java.io.File;
import java.util.*;
public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("d:/JavaFoleder/Skin");
		/*String[] s=f.list();//以字符串数组的形式返回当前文件夹下的所有文件，不包括子文件和子文件夹
		System.out.println(Arrays.toString(s));
		
		File[] fi=f.listFiles();//以文件数组的形式返回......
		System.out.println(Arrays.toString(fi));*/
		
		File[] a=f.listRoots();
		System.out.println(Arrays.toString(a));//列出所有盘
		f.delete();//删除

	}

}
