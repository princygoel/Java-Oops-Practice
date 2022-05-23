package com.inheritance;

public class Employee {
	int empID;
	String name, dept;
	double bSal, hra, da;
	
	public Employee() {
		empID =1001;
		name = "abc";
		dept = "deptName";
		bSal =1000;;
		hra=1000;
		da=100;
	}
	
	public Employee(int id, String nm, String dpt, double bs, double hr, double d) {
		empID =id;
		name =nm;
		dept =dpt;
		bSal =bs;
		hra=hr;
		da=d;
	}
	
	public double calculateSalary() {
		return (bSal+hra+da);
		
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", dept=" + dept + ", bSal=" + bSal + ", hra=" + hra
				+ ", da=" + da + "]";
	}

	
}
