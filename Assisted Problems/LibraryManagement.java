class Book{
	String title;
	int publicationYear;
	
	Book(String title, int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
	}
	void displayInfo(){
		System.out.println("Book title: "+title);
		System.out.println("Year or publication: "+publicationYear);
	}
}

class Author extends Book{
	String name;
	int age;
	
	Author(String title, int publicationYear, String name, int age){
		super(title, publicationYear);
		this.name=name;
		this.age=age;
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Author: "+name);
		System.out.println("Age of author: "+age);
	}
}

public class LibraryManagement{
	public static void main(String[] args){
		Author author=new Author("Fourth Wing", 2023, "Rebecca Yarros", 43);
		author.displayInfo();
	}
}
