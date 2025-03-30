class Vehicle{
	String model;
	int maxSpeed;
	
	Vehicle(String model, int maxSpeed){
		this.model=model;
		this.maxSpeed=maxSpeed;
	}
	void displayInfo(){
		System.out.println("Model: "+model);
		System.out.println("MAx speed: "+maxSpeed+" km/h");
	}
}

interface Refuelable{
	void refuel();
}

class PetrolVehicle extends Vehicle implements Refuelable{
	int fuelCapacity;
	PetrolVehicle(String model, int maxSpeed, int fuelCapacity){
		super(model, maxSpeed);
		this.fuelCapacity=fuelCapacity;
	}
	public void refuel(){
		System.out.println("Refuelling vehicle. Tank capacity: "+fuelCapacity);
	}
	@Override
	public void displayInfo(){
		System.out.println("Petrol Vehicles");
		super.displayInfo();
		System.out.println("Fuel Capacity: "+fuelCapacity);
	}
}

class ElectricVehicle extends Vehicle{
	int battery;
	ElectricVehicle(String model, int maxSpeed, int battery){
		super(model, maxSpeed);
		this.battery=battery;
	}
	@Override
	void displayInfo(){
		System.out.println("Petrol Vehicles");
		super.displayInfo();
		System.out.println("Batter capacity: "+battery+" kWh");
	}
}

public class VehicleSystem{
	public static void main(String[] args){
		PetrolVehicle v1=new PetrolVehicle("Ford", 250, 60);
		ElectricVehicle v2=new ElectricVehicle("Tesla", 260, 75);
		v1.displayInfo();
		v1.refuel();
		System.out.println();
		v2.displayInfo();
	}
}