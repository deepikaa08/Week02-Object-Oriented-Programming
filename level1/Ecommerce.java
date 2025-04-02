interface Taxable{
	double calculateTax();
	String getTaxDetails();
}

abstract class Product{
	private int productId;
	private String name;
	private double price;
	
	public Product(int productId, String name, double price){
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	public int getProductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId=productId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public abstract double calculateDiscount();
	
	public void displayDetails(){
		System.out.println("Product ID: "+productId);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}
}

class Electronics extends Product implements Taxable{
	private int warrantyInYears;
	
	public Electronics(int productId, String name, double price, int warrantyInYears){
		super(productId, name, price);
		this.warrantyInYears=warrantyInYears;
	}
	@Override
	public double calculateDiscount(){
		return getPrice()*0.1;
	}
	@Override
	public double calculateTax(){
		return getPrice()*0.18;
	}
	@Override
	public String getTaxDetails(){
		return "Tax for Electronics: 18%";
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Warranty period: "+warrantyInYears+" years");
		System.out.println(getTaxDetails());
	}
}

class Clothing extends Product implements Taxable{
	private String size;
	
	public Clothing(int productId, String name, double price, String size){
		super(productId, name, price);
		this.size=size;
	}
	@Override
	public double calculateDiscount(){
		return getPrice()*0.2;
	}
	@Override
	public double calculateTax(){
		return getPrice()*0.05;
	}
	@Override
	public String getTaxDetails(){
		return "Tax for Electronics: 5%";
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Size: "+size);
		System.out.println(getTaxDetails());
	}
}

class Groceries extends Product{
	private double weight;
	
	public Groceries(int productId, String name, double price, double weight){
		super(productId, name, price);
		this.weight=weight;
	}
	@Override
	public double calculateDiscount(){
		return getPrice()*0.05;
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Weight in kg: "+weight);
		System.out.println("No tax for groceries");
	}
}

public class Ecommerce{
	public static void finalPrices(Product[] products){
		for(Product p : products){
			System.out.println("Product details: ");
			p.displayDetails();
			double tax=(p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0.0;
			double discount =p.calculateDiscount();
			double finalp=p.getPrice()+tax-discount;
			System.out.println("Discount: "+discount);
			System.out.println("Tax: "+tax);
			System.out.println("Final price: "+finalp);
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Product electronics=new Electronics(101, "Laptop", 75000.0, 3);
		Product clothing=new Clothing(102, "Shirt", 1000.0, "L");
		Product grocery=new Groceries(103, "Rice", 700.0, 2);
		Product[] products={electronics, clothing, grocery};
		finalPrices(products);
	}
}



