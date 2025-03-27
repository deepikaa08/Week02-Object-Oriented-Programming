class CarRental{
	private String customerName;
	private String carModel;
	private int rentalDays;
	private double costPerDay=2000;
	
	public CarRental(String customerName, String carModel, int rentalDays){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	
	public double totalCost(){
		return rentalDays*costPerDay;
	}
	public void displayDetails(){
		System.out.println("Customer name: "+customerName);
		System.out.println("Car model: "+carModel);
		System.out.println("Number of days for rent: "+rentalDays);
		System.out.println("Total cost: "+totalCost());
	}
	public static void main(String[] args){
		CarRental details=new CarRental("AAA", "Creta", 3);
		details.displayDetails();
	}
}
