import java.util.ArrayList;
import java.util.List;
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public void showProductDetails() {
        System.out.println("Product: " + productName + " | Price: " + price);
    }
}

class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public int getOrderId() {
        return orderId;
    }
    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product p : products) {
            p.showProductDetails();
        }
        System.out.println("Total amount: " + calculateTotal());
    }
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

class Customer {
    private String customerName;
    private List<Order> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed Order ID: " + order.getOrderId());
    }
    public void showCustomerDetails() {
        System.out.println("\nCustomer: " + customerName);
        System.out.println("Orders placed:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

public class Ecommerce{
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 70000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2500);
        Customer customer1 = new Customer("AAA");
        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p3);
        Order order2 = new Order();
        order2.addProduct(p2);
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);
        customer1.showCustomerDetails();
    }
}

