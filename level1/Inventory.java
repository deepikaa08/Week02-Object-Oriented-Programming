import java.util.Scanner;
class Inventory{
	private int itemCode;
	private String itemName;
	private double price;
	
	Inventory(int itemCode, String itemName, double price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	
	public void displayDetails(int n){
		System.out.println("Item code: "+itemCode);
		System.out.println("Item name: "+itemName);
		System.out.println("Cost: "+price);
		System.out.println("Total: "+n*price);
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the quanity of product: ");
		int n=input.nextInt();
		Inventory things=new Inventory(56002, "Mascara", 299.0);
		things.displayDetails(n);
	}
}