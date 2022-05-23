package constructors;

public class BookThis {
	int id;
	String name, author;
	double price;
	
	public BookThis()
	{
		this(2,"Bookname","Author name", 10.0);
	}
	public BookThis (int id, String name, String author, double price) {
		
		this.id =id;
		this.name = name;
		this.author =author;
		this.price =price;
	}
	
	public void display() {
		System.out.println("Book Id:" +id +", Book name" +name + ", Author :" +author + ", Price:" +price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookThis b2 = new BookThis();
		b2.display();
		
		BookThis b1 = new BookThis(1, "Dheeraj", "Princy", 100.0);
		b1.display();
		
		
	}

}
