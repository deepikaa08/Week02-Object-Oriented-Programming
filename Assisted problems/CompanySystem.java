import java.util.ArrayList;
import java.util.List;
class Employee{
	private String name;
	public Employee(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void work(){
		System.out.println(name+" is working");
	}
}
class Department{
	private String name;
	private List<Employee> employees;
	public Department(String name){
		this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employeeName) {
        Employee employee = new Employee(employeeName);
        employees.add(employee);
        System.out.println("Added employee " + employeeName + " to department " + name);
    }

    public void showEmployees() {
        System.out.println("Employees in " + name + " department:");
        for (Employee e : employees) {
            System.out.println("- " + e.getName());
        }
    }

    public void clearEmployees() {
        employees.clear();
        System.out.println("All employees removed from " + name + " department.");
    }
}
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department dept = new Department(departmentName);
        departments.add(dept);
        System.out.println("Added department " + departmentName + " to company " + name);
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department dept : departments) {
            if (dept.getName().equals(departmentName)) {
                dept.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found in company " + name);
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            System.out.println("Department: " + dept.getName());
            dept.showEmployees();
            System.out.println();
        }
    }
    public void deleteCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("Company " + name + " and all its departments and employees have been deleted.");
    }
}
public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovators");
        company.addDepartment("Engineering");
        company.addDepartment("Human Resources");
        company.addEmployeeToDepartment("Engineering", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Human Resources", "Charlie");
        System.out.println();
        company.showCompanyStructure();
        System.out.println("Deleting the company...\n");
        company.deleteCompany();
        company.showCompanyStructure(); 
    }
}
