class Mobilephone{
	private String brand;
	private String model;
	private double price;
	
	Mobilephone(String brand, String model, double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public void displayDetails(){
		System.out.println("Brand name: "+brand);
		System.out.println("Model name: "+model);
		System.out.println("Cost: "+price);
	}
	public static void main(String[] args){
		 Mobilephone details= new Mobilephone("Apple", "iPhone 15", 79999.00);
		 details.displayDetails();
		 System.out.println();
		 Mobilephone details1= new Mobilephone("Samsung", "Galaxy S24", 68999.00);
		 details1.displayDetails();
	}
}