class Vehicle{
	static double registrationFee=1000.0;
	private String ownerName;
	private String vehicleType;
	private int registrationNumber;
	
	public Vehicle(String ownerName, String vehicleType, int registrationNumber){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.registrationNumber=registrationNumber;
	}
	public static void updateRegistrationFee(double newFee){
		registrationFee=newFee;
		System.out.println("Updated registration fee is: "+ registrationFee);
	}
	public void displayDetails(){
		if(this instanceof Vehicle){
			System.out.println("Owner name: "+this.ownerName);
			System.out.println("Type of vehicle: "+this.vehicleType);
			System.out.println("Registration number: "+this.registrationNumber);
			System.out.println("Registration fee: "+registrationFee);
			System.out.println();
		}
		else{
			System.out.println("Invalid object");
		}
	}
	public String getName(){
		return ownerName;
	}
	public int getRegistrationnumber(){
		return registrationNumber;
	}
	public String getType(){
		return vehicleType;
	}
}
public class VehicleRegistration{
	public static void main(String[] args){
		Vehicle v1=new Vehicle("AAA", "Car", 95684623);
		Vehicle v2=new Vehicle("BBB", "Van", 52364189);
		v1.displayDetails();
		v2.displayDetails();
		Vehicle.updateRegistrationFee(2000.00);
		System.out.println();
		v1.displayDetails();
		v2.displayDetails();
	}
}
