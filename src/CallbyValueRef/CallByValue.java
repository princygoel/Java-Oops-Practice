package CallbyValueRef;

public class CallByValue {
	public static void swap(int [] arr) {
		
		int temp;
		temp =arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	
	}

	public static void main(String[] args) {
		int [] num = new int[2];
		num[0] = 10;
		num[1] = 20;
		
		System.out.println("Before swapping X and Y is: " +num[0] +num[1]);
		swap(num);
		System.out.println("After swapping X and Y is :" +num[0] +num[1]);
		

	}

}
