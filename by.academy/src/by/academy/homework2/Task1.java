package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first line");
		String str1 = sc.nextLine();
		System.out.println("Enter second line");
		String str2 = sc.nextLine();
		StringBuilder sb = new StringBuilder(str2);
		sc.close();
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str2.indexOf(str1.charAt(i)) != -1) {
					str2 = String.valueOf(sb.deleteCharAt(str2.indexOf(str1.charAt(i))));
				} else {
					System.out.println("First line is not the permutation of characters of the second line");
					return;
				}
			}
		} else {
			System.out.println("First line is not the permutation of characters of the second line");
			return;
		}
		System.out.println("First line is the permutation of characters of the second line");
	}
}
