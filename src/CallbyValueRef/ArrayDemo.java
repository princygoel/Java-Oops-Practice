package CallbyValueRef;

import java.util.Scanner;

import com.objects.Student_object;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr = new int[5];
		System.out.println("Enter 5 integer value");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		// Printing array elements
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}

}
