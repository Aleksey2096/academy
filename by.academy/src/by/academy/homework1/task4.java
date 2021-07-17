package by.academy.homework1;

public class task4 {
	public static void main(String[] args) {
		for (double r = 0, i = 2, s = 0; r <= 1_000_000; s++) {
			r = Math.pow(i, s);
			System.out.print(r + " ");
		}
	}
}
