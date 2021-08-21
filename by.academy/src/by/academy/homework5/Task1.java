package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task1<T> {
	public static void main(String... args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(22);
		list.add(44);
		list.add(44);
		System.out.println(list.toString());
		Task1<Integer> task = new Task1<>();
		System.out.println(task.duplicateRemover(list).toString());
	}

	public Collection<T> duplicateRemover(Collection<T> c) {
		HashSet<T> set = new HashSet<>(c);
		return c = set;
	}
}
