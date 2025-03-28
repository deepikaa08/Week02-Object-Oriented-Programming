class Patient{
	static String hospitalName="ABC Hospital";
	static int totalPatients=0;
	private String name;
	private int age;
	private String ailment;
	private final int patientID;
	
	public Patient(String name, int age, String ailment, int patientID){
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		this.patientID=patientID;
		totalPatients++;
	}
	public static void getTotalpatients(){
		System.out.println("Total patients are: "+totalPatients);
	}
	public void displayDetails(){
		System.out.println("Patient ID: "+patientID);
		System.out.println("Patient name: "+name);
		System.out.println("Patient age: "+age);
		System.out.println("Patient ailemt: "+ailment);
		System.out.println();
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getailment(){
		return ailment;
	}
}
public class Hospital{
	public static void main(String[] args){
		Patient p1=new Patient("AAA", 25, "knee pain", 101);
		Patient p2=new Patient("BBB", 36, "asthma", 112);
		p1.displayDetails();
		p2.displayDetails();
		Patient.getTotalpatients();
	}
}

		