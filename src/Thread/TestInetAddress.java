package Thread;
import java.net.*;
public class TestInetAddress {
	public static void main(String[] args) {
		try {
			InetAddress address=InetAddress.getLocalHost();
			System.out.println("计算机："+address.getHostAddress());
			System.out.println("计算机："+address.getHostName());
			byte[] bytes=address.getAddress();
			System.out.println(address);
			InetAddress address2=InetAddress.getByName("DESKTOP-74V4U4N");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
