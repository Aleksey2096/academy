package by.academy.homework5;

import java.util.Iterator;

public class Task4Demo {
	public static void main(String... args) {
		Task4<Integer> task = new Task4<>();
		for (int i = 0; i < 20; i++) {
			task.getMarkList().add((int) (Math.random() * 11));
		}
		Iterator<Integer> iter = task.getMarkList().iterator();
		int max = 0;
		while (iter.hasNext()) {
			int num = iter.next();
			if (num > max) {
				max = num;
			}
		}
		System.out.println(task.getMarkList().toString());
		System.out.println(max);
	}
}
