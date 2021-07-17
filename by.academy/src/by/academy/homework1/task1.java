package by.academy.homework1;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of purchases");
		double value = sc.nextDouble();
		System.out.println("Enter the age of the customer");
		int age = sc.nextInt();
		double fPrice;
		if (value < 100) {
			fPrice = value * 0.95;
		} else if (value >= 100 && value < 200) {
			fPrice = value * 0.93;
		} else if (value >= 200 && value < 300 && age > 18) {
			fPrice = value * 0.84;
		} else if (value >= 200 && value < 300 && age <= 18) {
			fPrice = value * 0.91;
		} else if (value >= 300 && value < 400) {
			fPrice = value * 0.85;
		} else {
			fPrice = value * 0.80;
		}
		System.out.println("Final price = " + fPrice);
		sc.close();
	}
}
