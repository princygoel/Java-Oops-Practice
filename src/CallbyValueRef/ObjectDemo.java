package CallbyValueRef;

import com.objects.MyDate2;
   
public class ObjectDemo {
	
	public static void main(String[] args) {
		Object x;
		x =10;
		x =68.99;
		x =9.2f;
		x ="Hello";
		x = 'z';
		x =new MyDate2();
		//x =true;
		Object y = new MyDate2();
		x=y;
		System.out.println("x and y equal :" +x.equals(y));

		System.out.println("x hascode :" +x.hashCode());
		System.out.println("x hashcode :" +y.hashCode());
		System.out.println("x and y equal :" +x.equals(y));
		System.out.println("x and y equal :" +x.equals(y));
		System.out.println("Class of x is  :" +x.getClass());
        
		
        
	}

}
