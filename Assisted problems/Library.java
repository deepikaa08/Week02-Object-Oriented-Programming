import java.util.ArrayList;
import java.util.List;
class Book{
	private String title;
	private String author;
	
	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public void displayBooks(){
		System.out.println("Title: "+title+", Author: "+author);
	}
}
class Lib{
	private String name;
	private List<Book>books;
	
	public Lib(String name){
		this.name=name;
		this.books=new ArrayList<>();
	}
	public void addBook(Book book){
		books.add(book);
	}
	public void displayDetails(){
		System.out.println("Books in library are: ");
		System.out.println();
		for(Book b: books){
			b.displayBooks();
		}
		System.out.println();
	}
}
public class Library{
	public static void main(String[] args){
		Book b1=new Book("Fourth Wing", "Rebecca Yarros");
		Book b2=new Book("Reckless", "Lauren Roberts");
		Book b3=new Book("The Alchemist", "Paulo Coelho");
		Lib l1=new Lib("Central Library");
		Lib l2=new Lib("Community Library");
		l1.addBook(b1);
		l1.addBook(b2);
		l2.addBook(b2);
		l2.addBook(b3);
		l1.displayDetails();
		l2.displayDetails();
	}
}
