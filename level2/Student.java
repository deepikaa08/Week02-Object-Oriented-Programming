class Student{
	private String name;
	private int rollNumber;
	private int marks;
	
	Student(String name, int rollNumber, int marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	public String grades(){
		if (marks >= 90) {
            return "O";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }
	
	public void displayDetails(){
		System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grades());
	}
	
	public static void main(String[] args){
		Student s1=new Student("AAA", 001, 68);
		Student s2=new Student("BBB", 002, 97);
		Student s3=new Student("CCC", 003, 20);
		
		s1.displayDetails();
		System.out.println();
		s2.displayDetails();
		System.out.println();
		s3.displayDetails();
	}
}

		