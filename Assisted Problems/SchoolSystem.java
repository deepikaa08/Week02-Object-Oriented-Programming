class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void displayRole(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Teacher extends Person{
	String subject;
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject=subject;
	}
	@Override
	void displayRole(){
		System.out.println("Occupation: Teacher");
		super.displayRole();
		System.out.println("Subject: "+subject);
	}
}

class Student extends Person{
	String grade;
	Student(String name, int age, String grade){
		super(name, age);
		this.grade=grade;
	}
	@Override
	void displayRole(){
		System.out.println("Occupation: Student");
		super.displayRole();
		System.out.println("Grade: "+grade);
	}
}

class Staff extends Person{
	String department;
	Staff(String name, int age, String department){
		super(name, age);
		this.department=department;
	}
	@Override
	void displayRole(){
		System.out.println("Occupation: Staff");
		super.displayRole();
		System.out.println("department: "+department);
	}
}

public class SchoolSystem{
	public static void main(String[] args){
		Teacher teacher=new Teacher("AAA", 25, "Maths");
		Student student=new Student("BBB", 13, "A+");
		Staff staff=new Staff("CCC", 28, "Administartion");
		teacher.displayRole();
		System.out.println();
		student.displayRole();
		System.out.println();
		staff.displayRole();
	}
}
