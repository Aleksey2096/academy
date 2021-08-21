package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Task2<T> {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		LinkedList<Integer> list1 = new LinkedList<>();
		Task2<Integer> task = new Task2<>();
		task.createCollection(list);
		task.createCollection(list1);
		long startArrayList = System.currentTimeMillis();
		task.chooseFromCollection(list);
		long endArrayList = System.currentTimeMillis();
		task.chooseFromCollection(list1);
		long endLinkedList = System.currentTimeMillis();
		System.out.println("Time to choose from ArrayList = " + (endArrayList - startArrayList));
		System.out.println("Time to choose from LinkedList = " + (endLinkedList - endArrayList));
	}

	public Collection<Integer> createCollection(Collection<Integer> c) {
		for (int i = 0; i < 1000000; i++) {
			c.add((int) (Math.random() * 1000));
		}
		return c;
	}

	@SuppressWarnings("unchecked")
	public void chooseFromCollection(Collection<T> c) {
		if (c.getClass().toString().equals("class java.util.ArrayList")) {
			ArrayList<Integer> list = new ArrayList<>();
			list.addAll((Collection<? extends Integer>) c);
			for (int i = 0; i < 100000; i++) {
				list.get((int) (Math.random() * 1000000));
			}
		} else if (c.getClass().toString().equals("class java.util.LinkedList")) {
			LinkedList<Integer> list = new LinkedList<>();
			list.addAll((Collection<? extends Integer>) c);
			for (int i = 0; i < 100000; i++) {
				list.get((int) (Math.random() * 1000000));
			}
		}
	}
}
