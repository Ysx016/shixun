package Thread;

import java.net.*;

public class TestUrl {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url=new URL("http://baidu.com");
		URL u=new URL(url,"/index.html?username=mary");
		System.out.println("Э��"+u.getProtocol());
		System.out.println("����"+u.getPort());
		System.out.println("�ļ�·��"+u.getPath());
		System.out.println("�ļ���"+u.getFile());

	}

}
