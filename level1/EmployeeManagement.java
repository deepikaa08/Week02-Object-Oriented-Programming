interface Department{
	void assignDepartment(String departmentName);
	String getDepartmentDetails();
}

abstract class Employee{
	private int employeeId;
	private String name;
	private double baseSalary;
	
	public Employee(int employeeId, String name, double baseSalary){
		this.employeeId=employeeId;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	public int getEmployeeId(){
		return employeeId;
	}
	public void setemployeeId(int employeeId){
		this.employeeId=employeeId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary){
		this.baseSalary=baseSalary;
	}
	public abstract double calculateSalary();
	
	public void displayDetails(){
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Name: "+name);
		System.out.println("Base salary: "+baseSalary);
	}
}

class FullTimeEmployee extends Employee implements Department{
	private double bonus;
	private String departmentName;
	
	public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus){
		super(employeeId, name, baseSalary);
		this.bonus=bonus;
	}
	@Override
	public double calculateSalary(){
		return getBaseSalary()+bonus;
	}
	@Override
	public void assignDepartment(String departmentName){
		this.departmentName=departmentName;
	}
	@Override
	public String getDepartmentDetails(){
		return "Department: "+departmentName;
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+calculateSalary());
		System.out.println(getDepartmentDetails());
	}
}

class PartTimeEmployee extends Employee implements Department{
	private int hoursWorked;
	private double hourlyRate;
	private String departmentName;
	
	public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate){
		super(employeeId, name, baseSalary);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	@Override
	public double calculateSalary(){
		return getBaseSalary()+(hoursWorked*hourlyRate);
	}
	@Override
	public void assignDepartment(String departmentName){
		this.departmentName=departmentName;
	}
	@Override
	public String getDepartmentDetails(){
		return "Department: "+departmentName;
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Hours worked: "+hoursWorked);
		System.out.println("Hourly rate: "+hourlyRate);
		System.out.println("Total salary: "+calculateSalary());
		System.out.println(getDepartmentDetails());
	}
}

public class EmployeeManagement{
	public static void main(String[] args){
		Employee e1=new FullTimeEmployee(123, "AAA", 50000.0, 6000);
		Employee e2=new PartTimeEmployee(456, "BBB", 20000.0, 50, 3000);
		((Department)e1).assignDepartment("HR");
		((Department)e2).assignDepartment("IT");
		Employee[] employees={e1, e2};
		for(Employee emp : employees){
			System.out.println("Employee Details: ");
			emp.displayDetails();
			System.out.println();
		}
	}
}
