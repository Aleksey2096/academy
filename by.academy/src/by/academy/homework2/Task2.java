package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uniqSim = 0, repeatNum, min = Integer.MAX_VALUE, index = 0;
		System.out.println("Enter words separated by space");
		String[] arr = sc.nextLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			repeatNum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].indexOf(arr[i].charAt(j), j + 1) != -1) {
					repeatNum++;
				}
			}
			uniqSim = arr[i].length() - repeatNum;
			if (uniqSim < min) {
				min = uniqSim;
				index = i;
			}
		}
		System.out.println("The first word with the minimum number of unique characters: " + "\"" + arr[index] + "\"");
		sc.close();
	}
}
