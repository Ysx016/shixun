package tool;

public class Account {
	private String ID;
	private String name;
	private double balance;
	
	public  Account(String name,double balance) {}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Account(String iD, String name, double balance) {
		super();
		ID = iD;
		this.name = name;
		this.balance = balance;
	}

}
