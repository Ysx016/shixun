package Practice2;
import java.io.*;
public class Stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos=new FileOutputStream("d:/io/customer.txt");
			oos=new ObjectOutputStream(fos);
			
			Customer c1=new Customer("jerry",20,"1111");
			Customer c2=new Customer("lisa",10,"1112");
			System.out.println("------对象序列化-------------");
			
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.flush();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(null!=fos) {
						fos.close();
					}
					if(null!=oos) {
						oos.close();
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
	
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis=new FileInputStream("d:/io/customer.txt");
			ois=new ObjectInputStream(fis);
			Object c=null;
			while((c=ois.readObject())!=null) {
				Customer c1=(Customer)c;
				System.out.println(c1.age+" "+c1.name+" "+c1.password);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e3) {
			
			e3.printStackTrace();
			System.out.println("读取完毕");
		}catch(IOException e1) {
			e1.printStackTrace();
		}catch(ClassNotFoundException e2) {
			e2.printStackTrace();
		}
	}
}