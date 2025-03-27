import java.util.Scanner;
class Circle{
	private double radius;
	
	public Circle(){
		this.radius=0.0;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public void displayDetails(){
		System.out.println("Area of circle: "+Math.PI*radius*radius);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius=input.nextDouble();
		Circle c1=new Circle();
		c1.displayDetails();
		System.out.println();
		Circle c2=new Circle(radius);
		c2.displayDetails();
	}
}
