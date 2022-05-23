package com.inheritance;

public class Child extends InheritDemo {
	int childx;
	public Child() {
		super();
		childx =50;
		System.out.println("child class constructor");
	}
	public Child(int chilx) {
	    super(30);
		childx = super.parentx+chilx;
		System.out.println("child class ");
		
	}
	public void childmethod() {
		super.parentmethod();
		System.out.println("child");
	}

	public static void main(String[] args) {
		Child c1 = new Child(10);
	    c1.childmethod();
	//	c1.parentmethod();	

	}
}
