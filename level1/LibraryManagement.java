interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;
    private String borrower; 

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Reserved by " + borrower));
    }

    // Abstract method
    public abstract int getLoanDuration(); 
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books loan duration
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setAvailable(false);
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines loan duration
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setAvailable(false);
            setBorrower(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs loan duration
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setAvailable(false);
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

public class LibraryManagement{
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem item2 = new Magazine("M202", "National Geographic", "Various Authors");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");
        LibraryItem[] items = {item1, item2, item3};
        for (LibraryItem item : items) {
            System.out.println("\n--- Library Item Details ---");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("John Doe");
                } else {
                    System.out.println("Item is not available for reservation.");
                }
            }
        }
    }
}
