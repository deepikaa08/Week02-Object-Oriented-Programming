class Bookdetails{
	private String title;
	private String author;
	private double price;
	
	Bookdetails(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails(){
		System.out.println("Book name: "+title);
		System.out.println("Author: "+author);
		System.out.println("Cost: Rs "+price);
	}
	
	public static void main(String[] args){
		Bookdetails details=new Bookdetails("Fourth Wing", "Rebecca Yarros", 599.00);
		details.displayDetails();
	}
}
