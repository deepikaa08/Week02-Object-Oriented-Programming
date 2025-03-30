class Order{
	int orderId;
	String orderDate;
	
	Order(int orderId, String orderDate){
		this.orderId=orderId;
		this.orderDate=orderDate;
	}
	String getOrderStatus(){
		return "Order placed";
	}
	void displayInfo(){
		System.out.println("Order ID: "+orderId);
		System.out.println("Order Date: "+orderDate);
		System.out.println("Status: "+getOrderStatus());
	}
}

class ShippedOrder extends Order{
	int trackingNumber;
	ShippedOrder(int orderId, String orderDate, int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber=trackingNumber;
	}
	@Override
	String getOrderStatus(){
		return "Order shipped";
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Tracking number: "+trackingNumber);
	}
}

class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate=deliveryDate;
	}
	@Override
	String getOrderStatus(){
		return "Order delivered";
	}
	@Override
	void displayInfo(){
		super.displayInfo();
		System.out.println("Delivery date: "+deliveryDate);
	}
}

public class OnlineOrder{
	public static void main(String[] args){
		Order order=new Order(12365023, "09-04-2025");
		order.displayInfo();
		System.out.println();
		ShippedOrder shipped=new ShippedOrder(12365023, "09-04-2025", 856323);
		shipped.displayInfo();
		System.out.println();
		DeliveredOrder delivery=new DeliveredOrder(12365023, "09-04-2025", 856323, "11-04-2025");
		delivery.displayInfo();
	}
}
