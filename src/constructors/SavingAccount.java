package constructors;

public class SavingAccount {
	int custID;
	String acc, address, mob, name;
	double bal;
	static double rateofInterest;

	public SavingAccount() {
		custID = 101;
		acc = "1022";
		address = "noida";
		mob = "878777";
		bal = 1000.0;

	}

	public SavingAccount(int custID, String acc, String address, String mob, double bal) {
		this.custID = custID;
		this.acc = acc;
		this.address = address;
		this.mob = mob;
		this.bal = bal;

	}

	static {
		rateofInterest = 8;
	}

	public static void setInterest(int rate) {
		rateofInterest = rate;

	}

	public static double getInterest() {
		return rateofInterest;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public static void main(String[] args) {
		SavingAccount s2 = new SavingAccount();
		System.out.println("Rate of Interest :" + getInterest());
		System.out.println("Customer details --");
		System.out.println("Cust Id: " + s2.custID);
		System.out.println("Account:  " + s2.acc);
		System.out.println("Name: " + s2.name);
		System.out.println("Bal: " + s2.bal);
		SavingAccount s1 = new SavingAccount(102, "acc2", "delhi", "9999", 2000.0);
		System.out.println("Rate of Interest :" + getInterest());
		System.out.println("Customer details --");
		System.out.println("Cust Id: " + s1.custID);
		System.out.println("Account:  " + s1.acc);
		System.out.println("Name: " + s1.name);
		System.out.println("Bal: " + s1.bal);

	}

}
