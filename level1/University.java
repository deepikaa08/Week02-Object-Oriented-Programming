class Student{
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public Student(int rollNumber, String name, double cgpa){
		this.rollNumber=rollNumber;
		this.name=name;
		this.cgpa=cgpa;
	}
	public double getCgpa(){
		return cgpa;
	}
	public void setCgpa(double cgpa){
		if(cgpa>=0.0&&cgpa<=10.0){
			this.cgpa=cgpa;
		}
		else{
			System.out.println("Invalid CGPA");
		}
	}
	public void displayDetails(){
		System.out.println("Roll number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Cgpa: "+cgpa);
	}
}
	
class Postgraduate extends Student{
	private String specialization;
	
	public Postgraduate(int rollNumber, String name, double cgpa, String specialization){
		super(rollNumber, name, cgpa);
		this.specialization=specialization;
	}
	public void displayPGDetails(){
		System.out.println("Roll number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Cgpa: "+getCgpa());
		System.out.println("Specializtion: "+specialization);
	}
}

public class University{
	public static void main(String[] args){
		Student s1=new Student(001, "AAA", 9.1);
		s1.displayDetails();
		System.out.println();
		s1.setCgpa(9.5);
		System.out.println("Updated CGPA: "+s1.getCgpa());
		System.out.println();
		Postgraduate pg=new Postgraduate(002, "BBB", 8.6, "Computer Science");
		pg.displayPGDetails();
	}
}
