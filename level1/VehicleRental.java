interface Insurable{
	double calculateInsurance();
	String getInsuranceDetails();
}

abstract class Vehicle{
	String vehicleNumber;
	String type;
	double rentalRate;
	
	public Vehicle(String vehicleNumber, String type, double rentalRate){
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
	}
	public String getVehicleNumber(){
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber){
		this.vehicleNumber=vehicleNumber;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public double getRentalRate(){
		return rentalRate;
	}
	public void setRentalRate(double rentalRate){
		this.rentalRate=rentalRate;
	}
	public abstract double calculateRentalCost(int days);
	
	public void displayDetails(){
		System.out.println("Vehicle number: "+vehicleNumber);
		System.out.println("Type of vehicle: "+type);
		System.out.println("Rental rate: "+rentalRate);
	}
}

class Car extends Vehicle implements Insurable{
	public Car(String vehicleNumber, double rentalRate){
		super(vehicleNumber, "Car", rentalRate);
	}
	@Override
	public double calculateRentalCost(int days){
		return getRentalRate()*days;
	}
	public double calculateInsurance(){
		return 2000.0;
	}
	@Override
	public String getInsuranceDetails(){
		return "Standard Car Insurance";
	}
}

class Bike extends Vehicle implements Insurable{
	public Bike(String vehicleNumber, double rentalRate){
		super(vehicleNumber, "Bike", rentalRate);
	}
	@Override
	public double calculateRentalCost(int days){
		return getRentalRate()*days;
	}
	@Override
	public double calculateInsurance(){
		return 5000.0;
	}
	@Override
	public String getInsuranceDetails(){
		return "Standard Bike Insurance";
	}
}

class Truck	extends Vehicle implements Insurable{
	public Truck(String vehicleNumber, double rentalRate){
		super(vehicleNumber, "Truck", rentalRate);
	}
	@Override
	public double calculateRentalCost(int days){
		return getRentalRate()*days;
	}
	@Override
	public double calculateInsurance(){
		return 3000.0;
	}
	@Override
	public String getInsuranceDetails(){
		return "Standard Truck Insurance";
	}
}

public class VehicleRental{
	public static void main(String[] args){
		Vehicle car=new Car("CAR123", 1500.0);
		Vehicle bike=new Bike("BIKE456", 500.0);
		Vehicle truck=new Truck("TRUCK789", 3000.0);
		Vehicle[] vehicles={car, bike, truck};
		int rentalDays=5;
		for(Vehicle v : vehicles){
			System.out.println("Vehicle Details: ");
			v.displayDetails();
			System.out.println("Rental rate for "+rentalDays+" days is: "+v.calculateRentalCost(rentalDays));
			if( v instanceof Insurable){
				Insurable insurable=(Insurable) v;
				System.out.println("Insurance cost: "+insurable.calculateInsurance());
				System.out.println(insurable.getInsuranceDetails());
				System.out.println();
			}
		}
	}
}
