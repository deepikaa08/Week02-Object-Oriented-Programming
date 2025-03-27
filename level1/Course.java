class Course{
	private String courseName;
	private int duration;
	private double fee;
	private static String instituteName="A Institute";
	
	public Course(String courseName, int duration, double fee){
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
	}
	public void displayDetails(){
		System.out.println("Course name: "+courseName);
		System.out.println("Course duration: "+duration);
		System.out.println("Course fee: "+fee);
		System.out.println("Institute name: "+instituteName);
		System.out.println();
	}
	public static String updateInstituteName(String newName){
		return instituteName=newName;
	}
	public static void main(String[] args){
		Course c1=new Course("Java", 3, 15000);
		Course c2=new Course("Python", 5, 10000);
		c1.displayDetails();
		c2.displayDetails();
		Course.updateInstituteName("B Institute");
		c1.displayDetails();
		c2.displayDetails();
	}
}
