class Person{
	String name;
	int id;
	
	Person(String name, int id){
		this.name=name;
		this.id=id;
	}
	void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
}

interface Worker{
	void performDuties();
}

class Chef extends Person implements Worker{
	String speciality;
	Chef(String name, int id, String speciality){
		super(name, id);
		this.speciality=speciality;
	}
	@Override
	public void performDuties(){
		System.out.println("The chef specializes in "+speciality+" food");
	}
	@Override
	public void displayDetails(){
		System.out.println("Chef Details: ");
		super.displayDetails();
		System.out.println("Speciality: "+speciality);
	}
}

class Waiter extends Person implements Worker{
	int tables;
	Waiter(String name, int id, int tables){
		super(name, id);
		this.tables=tables;
	}
	@Override
	public void performDuties(){
		System.out.println("A waiter is assigned "+tables+" tables");
	}
	@Override
	public void displayDetails(){
		System.out.println("Waiter Details: ");
		super.displayDetails();
		System.out.println("Tables assigned: "+tables);
	}
}

public class Restaurant{
	public static void main(String[] args){
		Chef chef=new Chef("AAA", 123, "Italian");
		Waiter waiter=new Waiter("BBB", 456, 5);
		chef.displayDetails();
		chef.performDuties();
		System.out.println();
		waiter.displayDetails();
		waiter.performDuties();
	}
}
