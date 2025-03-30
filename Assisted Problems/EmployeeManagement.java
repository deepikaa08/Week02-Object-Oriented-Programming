class Employee{
	String name;
	int id;
	double salary;
	
	Employee(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name, int id, double salary, int teamSize){
		super(name, id, salary);
		this.teamSize=teamSize;
	}
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Team size: "+teamSize);
		System.out.println();
	}
}

class Developer extends Employee{
	String language;
	Developer(String name, int id, double salary, String language){
		super(name, id, salary);
		this.language=language;
	}
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Programming Language: "+language);
		System.out.println();
	}
}

class Intern extends Employee{
	int duration;
	Intern(String name, int id, double salary, int duration){
		super(name, id, salary);
		this.duration=duration;
	}
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Internship duration: "+duration+" months");
		System.out.println();
	}
}

public class EmployeeManagement{
	public static void main(String[] args){
		Manager manager=new Manager("AAA", 101, 50000.0, 5);
		Developer developer=new Developer("BBB", 102, 70000.0, "Java");
		Intern intern=new Intern("CCC", 103, 2000, 6);
		manager.displayDetails();
		developer.displayDetails();
		intern.displayDetails();
	}
}
