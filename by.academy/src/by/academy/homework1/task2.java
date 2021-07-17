package by.academy.homework1;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data type");
		String type = sc.nextLine();
		switch (type) {
		case "int":
			System.out.println("Enter variable");
			int intVar = sc.nextInt();
			System.out.println(intVar % 2);
			break;
		case "double":
			System.out.println("Enter variable");
			double doubleVar = sc.nextDouble();
			System.out.println(doubleVar * 0.7);
			break;
		case "float":
			System.out.println("Enter variable");
			float floatVar = sc.nextFloat();
			System.out.println(floatVar * floatVar);
			break;
		case "char":
			System.out.println("Enter variable");
			String stringVar1 = sc.nextLine();
			char charVar = stringVar1.charAt(stringVar1.length() - 1);
			System.out.println((int) charVar);
			break;
		case "String":
			System.out.println("Enter variable");
			String stringVar2 = sc.nextLine();
			System.out.println("Hello " + stringVar2);
			break;
		default:
			System.out.println("Unsupported type");
		}
		sc.close();
	}
}
