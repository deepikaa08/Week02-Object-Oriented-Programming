import java.util.Scanner;
class Movieticket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;
    Movieticket() {
        this.isBooked = false;
    }
    public void bookTicket(String movieName, int seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked!");
        }
    }
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie Name  : " + movieName);
            System.out.println("Seat Number : " + seatNumber);
            System.out.println("Price       : " + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movieticket ticket = new Movieticket();
        System.out.print("Enter movie name: ");
        String movie = input.nextLine();
        System.out.print("Enter seat number: ");
        int seat = input.nextInt();
        System.out.print("Enter ticket price: ");
        double cost = input.nextDouble();
        ticket.bookTicket(movie, seat, cost);
        ticket.displayTicket();
    }
}
