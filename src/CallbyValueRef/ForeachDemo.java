package CallbyValueRef;

public class ForeachDemo {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
// for each loop
        for(int j : arr) {
        	System.out.println(j);
        }
        String [] s = {"Hello", "world"};
        for(String i : s) {
        	System.out.println(i);
        }
	}
}
