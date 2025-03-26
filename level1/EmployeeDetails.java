class EmployeeDetails{
	private String name;
	private int id;
	private double salary;
	
	public EmployeeDetails(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails(){
		System.out.println("Employee ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args){
		EmployeeDetails emp1=new EmployeeDetails("Alice", 101, 50000);
		emp1.displayDetails();
	}
}
