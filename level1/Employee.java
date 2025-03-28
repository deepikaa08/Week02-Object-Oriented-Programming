class Emp{
	static String companyName="XYZ";
	static int totalEmployees=0;
	private final int id;
	private String name;
	private String designation;
	
	public Emp(int id, String name, String designation){
		this.id=id;
		this.name=name;
		this.designation=designation;
		totalEmployees++;
	}
	public static void displayTotalEmployees(){
		System.out.println("Total number of employees: "+totalEmployees);
	}
	public void displayDetails(){
		System.out.println("Comapny name: "+companyName);
		System.out.println("Employee name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Designation: "+designation);
	}
	public String getName(){
		return name;
	}
	public int getID(){
		return id;
	}
	public String getDesignation(){
		return designation;
	}
}

public class Employee{
	public static void main(String[] args){
		Emp e1=new Emp(001, "AAA", "Manager");
		Emp e2=new Emp(002, "BBB", "Engineer");
		e1.displayDetails();
		System.out.println();
		e2.displayDetails();
		System.out.println();	
		Emp.displayTotalEmployees();
	}
}
