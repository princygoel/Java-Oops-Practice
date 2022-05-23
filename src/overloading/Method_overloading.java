package overloading;

public class Method_overloading {
 
	public int add(int x, int y) {
		return(x+y);
	}
	public int add(int x, int y, int z) {
		return(x+y+z);
	}
	public double add(int x, double y) {
		return(x+y);
	}
	public float add(float x, float y) {
		return(x+y);
	}
	public double add(int x, float y, double z) {
		return(x+y+z);
	}
	public double add(int x, double y, float z) {
		return(x+y+z);
	}
	public String add (String x, String y) {
		return(x + "" +y);
	}

	public static void main(String[] args) {
		Method_overloading m1 = new Method_overloading();
		System.out.println("Using add method" +m1.add(3, 4));
		System.out.println("Using add method" +m1.add(4.5f, 5.5f));
		System.out.println("Using add method" +m1.add("Hello", " Love"));
		System.out.println("Using add method" +m1.add(3, 4.0));
	}

}
