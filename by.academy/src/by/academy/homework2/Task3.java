package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words separated by space with the even number of characters");
		String[] arr = sc.nextLine().split(" ");
		while (arr[0].length() % 2 != 0 || arr[1].length() % 2 != 0 || arr.length != 2) {
			System.out.println("Enter right words");
			arr = sc.nextLine().split(" ");
		}
		String str = arr[0].substring(0, arr[0].length() / 2) + arr[1].substring(arr[1].length() / 2);
		System.out.println("Your new word: " + "\"" + str + "\"");
		sc.close();
	}
}
