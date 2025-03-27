class Library{
	private String title;
	private String author;
	private double price;
	private boolean availability;
	
	public Library(String title, String author, double price, boolean availability){
		this.title=title;
		this.author=author;
		this.price=price;
		this.availability=true;
	}
	public void borrow(){
		if(availability){
			System.out.println("Book borrowed successfully");
			availability=false;
		}
		else{
			System.out.println("Unable to borrow book" );
		}
	}
	public static void main(String[] args){
		Library b1=new Library("Fourth Wing", "Rebecca Yarros", 599.99, true);
		b1.borrow();
		b1.borrow();
	}
}
