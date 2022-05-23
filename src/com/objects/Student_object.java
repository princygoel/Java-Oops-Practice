package com.objects;

public class Student_object {

	int rollNo;
	String name, address, emailID, mobNo;

	public void setDetails(int rn, String n, String add, String email, String mob) {
		rollNo = rn;
		name = n;
		address = add;
		emailID = email;
		mobNo = mob;

	}
	

	public void displayDetails() {
			System.out.println("RollNo is"+rollNo+ 
					"\t Name is"+name + 
					"\t Address is:"+address + 
					"\t email is :" +emailID + 
					"\t Mobile:" +mobNo
					);
			
		}

	public static void main(String[] args) {
			Student_object s1 = new Student_object();
			s1.setDetails(1, "Dheeraj", "Noida", "princy@gmail.com", "8888999988s");
			s1.displayDetails();
	}
}
