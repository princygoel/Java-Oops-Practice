package com.inheritance;

public class InheritDemo2 {
	public static void main(String[] args) {
		Employee [] e = new Employee[3];
		e[0] = new Employee();
		e[1] = new Manager();
		e[2] = new Executive();
		
		for(Emplyee ex : e) {
			System.out.println(ex.calculateSalary());
		}
		// Parent class object refering to child object.
		//Employee e1 = new Employee(1020, "Aksha","QA",30000,5000,2000);
		/*Manager m1 = new Manager(1010, "Aksha","QA",30000,5000,2000,10000);
		System.out.println(m1);
		System.out.println("Manager gross salary :"+m1.calculateSalary());
		Employee e = new Employee(1020, "Aksha","QA",30000,5000,2000);
		System.out.println(e);
		System.out.println("Employee :" +e.calculateSalary());*/

	}

}
