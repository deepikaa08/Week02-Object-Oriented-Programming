import java.util.ArrayList;
import java.util.List;
class Faculty{
	private String name;
	public Faculty(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void showFacultyDetails(){
		System.out.println("Faculty: "+name);
	}
}
class Department{
	private String departmentName;
	public Department(String departmentName){
		this.departmentName=departmentName;
	}
	public String getDepartmentName(){
		return departmentName;
	}
	public void showDepartmentDetails(){
		System.out.println("Department: "+departmentName);
	}
}
class University{
	private String universityName;
	private List<Department> departments;
	private List<Faculty> faculties;
	
	public University(String universityName){
		this.universityName=universityName;
		this.departments=new ArrayList<>();
		this.faculties=new ArrayList<>();
	}
	public void addDepartment(String deptName){
		Department dept=new Department(deptName);
		departments.add(dept);
		System.out.println("Department "+deptName+" added to "+universityName);
	}
	public void addFaculty(Faculty faculty){
		faculties.add(faculty);
		System.out.println("Faculty "+faculty.getName()+" associted with "+universityName);
	}
	public void showUniversityDetails(){
		System.out.println("University: "+universityName);
		System.out.println("Departments: ");
		for(Department dept:departments){
			dept.showDepartmentDetails();
		}
		System.out.println("Faculties: ");
		for(Faculty fac: faculties){
			fac.showFacultyDetails();
		}
	}
	public void closeUniversity(){
		System.out.println("\nClosing University: "+universityName);
		departments.clear();
		faculties.clear();
	}
}
public class UniversitySystem{
	public static void main(String[] args){
		Faculty f1=new Faculty("Dr.Alice");
		Faculty f2=new Faculty("Dr.Bob");
		University uni=new University("Tech University");
		uni.addDepartment("Computer Science");
		uni.addDepartment("Mechanical Engineering");
		uni.addFaculty(f1);
		uni.addFaculty(f2);
		uni.showUniversityDetails();
		uni.closeUniversity();
		System.out.println("\nFaculties still exist independently:");
		f1.showFacultyDetails();
		f2.showFacultyDetails();
	}
}

		