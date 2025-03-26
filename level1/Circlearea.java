import java.util.Scanner;
class Circlearea{
	private double radius;
	
	public Circlearea(double radius){
		this.radius=radius;
	}
	
	public void displayDetails(){
		double area=Math.PI*radius*radius;
		double circumference=2*Math.PI*radius;
		System.out.println("The area of the circle is: "+area);
		System.out.println("Circumference of a circle is: "+circumference);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius=input.nextDouble();
		Circlearea circ=new Circlearea(radius);
		circ.displayDetails();
	}
}
