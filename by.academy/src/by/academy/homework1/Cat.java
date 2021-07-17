package by.academy.homework1;

public class Cat {
	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;

	public void grow() {
		age += 1;
	}

	public void sleep() {
		System.out.println("The cat is sleeping");
	}

	public void eat() {
		System.out.println("The cat is eating");
	}

	public void walk() {
		System.out.println("The cat is walking");
	}

	public Cat() {
	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
}
