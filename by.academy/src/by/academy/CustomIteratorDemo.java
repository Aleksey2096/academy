package by.academy.homework5;

public class CustomIteratorDemo {
	public static void main(String... args) {
		Integer[][] arr = { { 1, 2, 3, 4 }, { 5 }, { 6, 7, 8, 9, 10, 11 }, { 12, 13 }, { 14, 15, 16, 17, 18, 19, 20 } };
		CustomIterator<Integer> iter = new CustomIterator<>(arr);
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
