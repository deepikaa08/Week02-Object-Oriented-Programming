class Vehicle{
	private String ownerName;
	private String vehicleType;
	private static double registrationFee=100.00;
	
	public Vehicle(String ownerName, String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	public void displayDetails(){
		System.out.println("Owner name: "+ownerName);
		System.out.println("Type of vehicle: "+vehicleType);
		System.out.println("Registration fee: "+registrationFee);
		System.out.println();
	}
	public static double updateRegistrationFee(double newFee){
		return registrationFee=newFee;
	}
	public static void main(String[] args){
		Vehicle v1=new Vehicle("AAA", "Car");
		Vehicle v2=new Vehicle("BBB", "Van");
		v1.displayDetails();
		v2.displayDetails();
		Vehicle.updateRegistrationFee(200.00);
		v1.displayDetails();
		v2.displayDetails();
	}
}
