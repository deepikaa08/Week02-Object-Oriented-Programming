class Product{
	private String productName;
	private double price;
	private static int totalProducts=0;
	
	public Product(String productName, double price){
		this.productName=productName;
		this.price=price;
		totalProducts++;
	}
	
	public void displayDetails(){
		System.out.println("Product name: "+productName);
		System.out.println("Cost: "+price);
	}
	
	public static void displayProducts(){
		System.out.println("Total products: "+totalProducts);
	}
	public static void main(String[] args){
		Product p1=new Product("Apple", 25.00);
		Product p2=new Product("Banana", 30.00);
		p1.displayDetails();
		System.out.println();
		p2.displayDetails();
		System.out.println();
		Product.displayProducts();
	}
}
