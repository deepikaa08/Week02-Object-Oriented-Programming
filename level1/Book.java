class Book{
	private String title;
	private String author;
	private double price;
	
	public Book(){
		this.title="Unknown title";
		this.author="Unknown author";
		this.price=0.0;
	}
	
	public Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void displayDetails(){
		System.out.println("Book name: "+title);
		System.out.println("Author : "+author);
		System.out.println("Cost: "+price);
	}
	
	public static void main(String[] args){
		Book b1=new Book();
		b1.displayDetails();
		System.out.println();
		Book b2=new Book("Fourth Wing", "Rebecca Yarros", 599.0);
		b2.displayDetails();
	}
}

		