class Hotel{
	private String guestName;
	private String roomType;
	private int nights;
	
	public Hotel(){
		this.guestName="Noone";
		this.roomType="No room";
		this.nights=0;
	}
	public Hotel(String guestName, String roomType, int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	public Hotel(Hotel anotherGuest){
		this.guestName=anotherGuest.guestName;
		this.roomType=anotherGuest.roomType;
		this.nights=anotherGuest.nights;
	}
	public void displayDetails(){
		System.out.println("Guest name: "+guestName);
		System.out.println("Room Type: "+roomType);
		System.out.println("Number of nights: "+nights);
	}
	public static void main(String[] args){
		Hotel h1=new Hotel();
		h1.displayDetails();
		System.out.println();
		Hotel h2=new Hotel("AAA", "Suite", 2);
		h2.displayDetails();
		System.out.println();
		Hotel h3=new Hotel(h2);
		h3.displayDetails();
	}
}
