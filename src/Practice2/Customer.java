package Practice2;

import java.io.IOException;

public class Customer {
	String name;
	int age;
	transient String password;
	public Customer(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}