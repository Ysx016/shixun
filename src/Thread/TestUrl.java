package Thread;

import java.net.*;

public class TestUrl {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url=new URL("http://baidu.com");
		URL u=new URL(url,"/index.html?username=mary");
		System.out.println("协议"+u.getProtocol());
		System.out.println("主机"+u.getPort());
		System.out.println("文件路径"+u.getPath());
		System.out.println("文件名"+u.getFile());

	}

}
