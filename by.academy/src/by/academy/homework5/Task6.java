package by.academy.homework5;

public class Task6 {
	public static void main(String... args) {
		int[] arr = new int[8];
		try {
			for (int i = 0; i < 10; i++) {
				arr[i] = i + 1;
				System.out.print(arr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println('\n' + "Array is to small, expand the array");
		}
	}
}
