class Items{
	static double discount=5.0;
	private final int productID;
	private String productName;
	private double price;
	private int quantity;
	
	public Items(int productID, String productName, double price, int quantity){
		this.productID=productID;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	public static void updateDiscount(double newDiscount){
		discount = newDiscount;
		System.out.println("Discount update to: "+discount+" %");
	}
	public void displayDetails(){
		if(this instanceof Items){
			System.out.println("Product ID: "+this.productID);
			System.out.println("Product name: "+this.productName);
			System.out.println("Cost: "+price);
			System.out.println("Quantity: "+quantity);
			System.out.println("Current discount: "+discount+" %");
			double discountedPrice=price-(price*discount/100);
			System.out.println("Price after discount: "+discountedPrice);
		}
		else{
			System.out.println("Invalid object");
		}
	}
	public int getProductID(){
		return productID;
	}
	public String getProductname(){
		return productName;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
}
public class Product{
	public static void main(String[] args){
		Items p1=new Items(001, "apple", 25.00, 3);
		Items p2=new Items(002, "banana", 15.00, 5);
		p1.displayDetails();
		System.out.println();
		p2.displayDetails();
		Items.updateDiscount(25.0);
		System.out.println();
		p1.displayDetails();
		System.out.println();
		p2.displayDetails();
	}
}
