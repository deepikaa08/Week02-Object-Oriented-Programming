class Animal{
	String name;
	int age;
	Animal(String name, int age){
		this.name=name;
		this.age=age;
	}
	void makeSound(){
		System.out.println("Animals make sound");
	}
}

class Dog extends Animal{
	Dog(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound(){
		System.out.println(name+", "+age+" years old dog, barks");
	}
}

class Cat extends Animal{
	Cat(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound(){
		System.out.println(name+", "+age+" years old cat, meows");
	}
}

class Bird extends Animal{
	Bird(String name, int age){
		super(name, age);
	}
	@Override
	void makeSound(){
		System.out.println(name+", "+age+" years old bird, chirps");
	}
}

public class AnimalHeirachy{
	public static void main(String[] args){
		Animal animal=new Animal("Mammals", 100);
		animal.makeSound();
		Dog dog=new Dog("Buddy", 5);
		dog.makeSound();
		Cat cat=new Cat("Whiskers", 3);
		cat.makeSound();
		Bird bird=new Bird("Tweets", 1);
		bird.makeSound();
	}
}
