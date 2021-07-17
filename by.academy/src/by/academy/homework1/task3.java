package by.academy.homework1;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		System.out.println("Enter integer from 1 to 10");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 1 && num <= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num * i);
			}
		}
		sc.close();
	}
}
