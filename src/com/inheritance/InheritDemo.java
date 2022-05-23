package com.inheritance;

public class InheritDemo {
	int parentx;
	
	public InheritDemo() {
		
		parentx=10;
		System.out.println("parent constructor");
	}
	public InheritDemo(int parx) {
		
		parentx =parx;
		System.out.println("parent");
	}
	public void parentmethod() {
		System.out.println("parent method");
	}
}
