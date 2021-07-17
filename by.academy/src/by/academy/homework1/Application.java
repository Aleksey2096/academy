package by.academy.homework1;

public class Application {
	public static void main(String... args) {
		Cat cat1 = new Cat();
		Cat tom = new Cat("Tom");
		tom.eat();
		tom.sleep();
		tom.walk();
		cat1.grow();
		cat1.grow();
		cat1.grow();
		System.out.println("cat1 age = " + cat1.age);
	}
}
