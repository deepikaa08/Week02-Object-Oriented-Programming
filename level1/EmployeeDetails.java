class Employee{
	public int employeeID;
	protected String department;
	private double salary;
	
	public Employee(int employeeID, String department, double salary){
		this.employeeID=employeeID;
		this.department=department;
		this.salary=salary;
	}
	public void setSalary(double salary){
		if(salary>0){
			this.salary=salary;
		}
		else{
			System.out.println("Invalid amount");
		}
	}
	public void displayDetails(){
		System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
		System.out.println();
    }
}
class Manager extends Employee{
	public Manager(int employeeID, String department, double salary){
		super(employeeID, department, salary);
	}
	public void displayManagerdetails(){
		System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department); 
	}
}
public class EmployeeDetails{
	public static void main(String[] args){
		Employee emp=new Employee(001, "Sales", 50000);
		emp.displayDetails();
		emp.setSalary(600000);
		emp.displayDetails();
		System.out.println();
		Manager mgr=new Manager(002, "Marketing", 70000);
		mgr.displayManagerdetails();
		mgr.setSalary(80000);
		mgr.displayDetails();
	}
}
