package com.inheritance;

public class Executive extends Employee {

	double incentive;
	
	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + ", empID=" + empID + ", name=" + name + ", dept=" + dept + ", bSal=" + bSal
				+ ", hra=" + hra + ", da=" + da + "]";
	}
	public Executive () {
		super();
		incentive =100;
	}
	public Executive(int id, String nm, String dpt, double bs, double hr, double d, double inc) {
		super(id,nm,dpt,bs,hr,d);
		incentive = inc;
	}
	public double calculateSalary() {
		return (super.calculateSalary()+incentive);
	}
}
