class Book{
	static String libraryName="Central Library";
	private final String isbn;
	private String title;
	private String author;
	
	public Book(String title, String author, String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public static void displayLibrary(){
		System.out.println("Library name: "+libraryName);
	}
	public void displayBookDetails(){
		if(this instanceof Book){
			System.out.println("Library: "+libraryName);
			System.out.println("Book name: "+this.title);
			System.out.println("Author: "+this.author);
			System.out.println("ISBN: "+this.isbn);
		}
		else{
			System.out.println("Invalid object");
		}
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String getISBN(){
		return isbn;
	}
}
public class Library{
	public static void main(String[] args){
		Book b1=new Book("Fourth Wing", "Rebecca Yarros", "9780743273565");
		Book b2=new Book("Reckless", "Lauren Roberts", "9780451524935");
		Book.displayLibrary();
		System.out.println();
		b1.displayBookDetails();
		System.out.println();
		b2.displayBookDetails();
	}
}
