class Person{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public Person(Person otherPerson){
		this.name=otherPerson.name;
		this.age=otherPerson.age;
	}
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public static void main(String[] args){
		Person p1=new Person("AAA", 25);
		p1.displayDetails();
		System.out.println();
		Person p2=new Person(p1);
		p2.displayDetails();
	}
}
