interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    protected void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; 
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

public class RideHailing{
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + fare);
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR101", "Alice", 15.0, "Downtown");
        Vehicle bike = new Bike("BIKE202", "Bob", 10.0, "Uptown");
        Vehicle auto = new Auto("AUTO303", "Charlie", 12.0, "Midtown");

        Vehicle[] vehicles = {car, bike, auto};

        double distance = 12.5; 
        for (Vehicle vehicle : vehicles) {
            processRide(vehicle, distance);
        }
    }
}