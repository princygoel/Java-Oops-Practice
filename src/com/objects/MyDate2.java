package com.objects;

public class MyDate2 {
	private int year, month, day;
	
	public void setDay(int d)
	{
		day=d;
	}
	public void setMonth(int m)
	{
		month=m;
	}
	public void setYear(int y)
	{
		year=y;
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	@Override
	public String toString() {
		return "MyDate2 [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	public static void main(String[] args) {
		MyDate2 md = new MyDate2();
		md.setDay(12);
		md.setMonth(12);
		md.setYear(2021);
		
		//System.out.println(md.getDay() + "/" + md.getMonth() + "/" + md.getYear());
		System.out.println(md);

	}

}
