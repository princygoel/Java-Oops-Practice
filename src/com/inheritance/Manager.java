package com.inheritance;

public class Manager extends Employee {
	double bonus;
	
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", empID=" + empID + ", name=" + name + ", dept=" + dept + ", bSal=" + bSal
				+ ", hra=" + hra + ", da=" + da + "]";
	}
	public Manager () {
		super();
		bonus =1000;
	}
	public Manager(int id, String nm, String dpt, double bs, double hr, double d, double bns) {
		super(id,nm,dpt,bs,hr,d);
		bonus = bns;
	}
	public double calculateSalary() {
		return (super.calculateSalary()+bonus);
	}
}
