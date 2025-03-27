class Books{
	public String ISBN;
	protected String title;
	private String author;
	
	public Books(String ISBN, String title, String author){
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
	public void displayDetails(){
		System.out.println("ISBN: "+ISBN);
		System.out.println("Author: "+author);
		System.out.println("Title: "+title);
	}
}
class Ebook extends Books{
	private double filesize;
	
	public Ebook(String ISBN, String title, String author, double filesize){
		super(ISBN, title, author);
		this.filesize=filesize;
	}
	public void displayEbookdetails(){
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("File size: "+filesize+" MB");
		System.out.println("Author: "+getAuthor());
	}
}
public class LibrarySystem{
	public static void main(String[] args){
		Books b1=new Books("978-3-16-148410-0", "Java Programming", "AAA");
		b1.displayDetails();
		System.out.println();
		Ebook b2=new Ebook("978-0-13-468599-1", "Effective Java", "BBB", 2.5);
		b2.displayEbookdetails();
	}
}
