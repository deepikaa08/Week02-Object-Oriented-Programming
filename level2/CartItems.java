import java.util.ArrayList;
import java.util.Scanner;
class Shoppingcart{
	String itemName;
	double price;
	int quantity;
	Shoppingcart(String itemName, double price, int quantity){
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	public double getTotalCost(){
		return price*quantity;
	}
}
public class CartItems{
	private ArrayList<Shoppingcart> cart=new ArrayList<>();
	public void addItem(String name, double price, int quantity){
		cart.add(new Shoppingcart(name, price, quantity));
		System.out.println(quantity+" x "+name+" added to cart");
	}
	public void removeItem(String name){
		boolean found=false;
		for(int i=0; i<cart.size(); i++){
			if(cart.get(i).itemName.equalsIgnoreCase(name)){
				cart.remove(i);
				System.out.println(name+" removed from cart");
				found=true;
				break;
			}
		}
		if(!found){
			System.out.println("Item not found");
		}
	}
	public void displayTotal(){
		double total=0;
		for(Shoppingcart item: cart){
			System.out.println(item.quantity+" x "+item.itemName+" at "+item.price+" = "+item.getTotalCost());
			total += item.getTotalCost();
		}
		System.out.println("Total cost: "+total);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		CartItems mycart=new CartItems();
		int choice;
		do{
			System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
			input.nextLine();
			switch(choice){
				case 1:
					System.out.print("Enter item name: ");
					String name = input.nextLine();
					System.out.print("Enter price: ");
					double price =input.nextDouble();
					System.out.print("Enter quantity: ");
					int quantity=input.nextInt();
					mycart.addItem(name, price, quantity);
					break;
				case 2:
					System.out.print("Enter item name: ");
					String removeItem=input.nextLine();
					mycart.removeItem(removeItem);
					break;
				case 3: 
					mycart.displayTotal();
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid choice");
			}
		}while(choice !=4);
	}
}
