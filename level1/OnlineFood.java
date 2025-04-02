interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    protected double discountAmount = 0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = (getPrice() * getQuantity()) * percentage / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Veg Item: " + discountAmount;
    }
}

class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        double additionalCharge = baseTotal * 0.10; 
        return baseTotal + additionalCharge - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        double baseTotal = getPrice() * getQuantity();
        discountAmount = baseTotal * percentage / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: " + discountAmount;
    }
}

public class OnlineFood{
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Butter Masala", 250.0, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 350.0, 3);
        FoodItem[] order = {item1, item2};
        for (FoodItem item : order) {
            System.out.println(" Food Item Details ");
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10); 
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("Total Price after discount: " + item.calculateTotalPrice());
			System.out.println();
        }
    }
}
