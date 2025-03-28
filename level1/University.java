class Student{
	static String universityName="ABC University";
	static int totalStudents=0;
	private String name;
	private final int rollNumber; 
	private String grade;
	
	public Student(String name, int rollNumber, String grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		totalStudents++;
	}
	public static void displayTotalStudents(){
		System.out.println("Total number of students: "+totalStudents);
	}
	public void displayDetails(){
		System.out.println("University name: "+universityName);
		System.out.println("Student name: "+name);
		System.out.println("Roll number: "+rollNumber);
		System.out.println("Grade: "+grade);
		System.out.println();
	}
	public String getName(){
		return name;
	}
	public int rollNumber(){
		return rollNumber;
	}
	public String getgrade(){
		return grade;
	}
}
public class University{
	public static void main(String[] args){
		Student s1=new Student("AAA", 001, "A");
		Student s2=new Student("BBB", 002, "C");
		s1.displayDetails();
		s2.displayDetails();
		Student.displayTotalStudents();
	}
}

	