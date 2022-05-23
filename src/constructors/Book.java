package constructors;

public class Book {
	int id;
	String name, author;
	double price;
	
	public Book()
	{
		id =2;
		name ="priya";
		author = "dheer";
		price = 200;
	}
	public Book(int i, String n, String au, double p) {
		id =i;
		name = n;
		author =au;
		price =p;
	}
	
	public void display() {
		System.out.println("Book Id :" +id +", Book name: " +name + ", Author :" +author + ", Price: " +price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b2 = new Book();
		b2.display();
		
		Book b1 = new Book(1, "Dheeraj", "Princy", 100);
		b1.display();
		

	}

}
