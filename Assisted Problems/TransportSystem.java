class Vehicle{
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed, String fuelType){
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	void displayInfo(){
		System.out.println("Max speed: "+maxSpeed);
		System.out.println("Type of fuel: "+fuelType);
	}
}

class Car extends Vehicle{
	int seatCapacity;
	Car(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity=seatCapacity;
	}
	@Override
	void displayInfo(){
		System.out.println("Vehicle Type: Car");
		super.displayInfo();
		System.out.println("Seat capacity: "+seatCapacity);
	}
}

class Truck extends Vehicle{
	int loadCapacity;
	Truck(int maxSpeed, String fuelType, int loadCapacity){
		super(maxSpeed, fuelType);
		this.loadCapacity=loadCapacity;
	}
	@Override
	void displayInfo(){
		System.out.println("Vehicle Type: Truck");
		super.displayInfo();
		System.out.println("Load capacity: "+loadCapacity+" tons");
	}
}

class Motorcycle extends Vehicle{
	String brand;
	Motorcycle(int maxSpeed, String fuelType, String brand){
		super(maxSpeed, fuelType);
		this.brand=brand;
	}
	@Override
	void displayInfo(){
		System.out.println("Vehicle Type: Motorcycle");
		super.displayInfo();
		System.out.println("Motorcycle brand: "+brand);
	}
}

public class TransportSystem{
	public static void main(String[] args){
		Car car=new Car(80, "Petrol", 4);
		Truck truck=new Truck(150, "Diesel", 10);
		Motorcycle bike=new Motorcycle(100, "Petrol", "Yamaha"); 
		car.displayInfo();
		System.out.println();
		truck.displayInfo();
		System.out.println();
		bike.displayInfo();
	}
}