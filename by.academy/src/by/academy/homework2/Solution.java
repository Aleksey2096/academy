package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] - arr[j] == k) {
					pairsCount++;
				}
				if (arr[j] - arr[i] == k) {
					pairsCount++;
				}
			}
		}
		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[Integer.parseInt(nk[0])];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		}

		System.out.println(pairs(k, arr));

		scanner.close();
	}
}
