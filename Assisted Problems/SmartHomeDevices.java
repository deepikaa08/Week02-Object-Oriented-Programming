class Device{
	int deviceId;
	String status;
	
	Device(int deviceId, String status){
		this.deviceId=deviceId;
		this.status=status;
	}
	void displayStatus(){
		System.out.println("Device id: "+deviceId);
		System.out.println("Device status: "+status);
	}
}

class Thermostat extends Device{
	double temperatureSetting;
	Thermostat(int deviceId, String status, double temperatureSetting){
		super(deviceId, status);
		this.temperatureSetting=temperatureSetting;
	}
	@Override
	void displayStatus(){
		System.out.println("Device name: Thermostat");
		super.displayStatus();
		System.out.println("Temperature: "+temperatureSetting+" Celsius");
	}
}
public class SmartHomeDevices{
	public static void main(String[] args){
		Thermostat thermo=new Thermostat(1001, "Off", 26.4);
		thermo.displayStatus();
	}
}
