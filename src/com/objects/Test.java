package com.objects;

class MyDate {

	int year, month, day;

	public void setDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;

	}

	public void printDate() {
		System.out.println("Date is" + day + "/" + month + "/" + year);

	}
}

/*public class Test {

	public static void main(String[] args) {
		MyDate s1 = new MyDate();
		s1.setDate(21, 12, 2021);
		s1.printDate();
	}
*/

