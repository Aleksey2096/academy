package by.academy.homework4;

import java.util.Arrays;

public class Task2<T> {
	private T[] items;

	@SuppressWarnings("unchecked")
	public Task2() {
		super();
		items = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Task2(int num) {
		super();
		items = (T[]) new Object[num];
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public void add(T obj) {
		if (items[items.length - 1] != null) {
			expand();
		}
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = obj;
				break;
			}
		}
	}

	public T get(int i) {
		if (i >= items.length || i < 0) {
			System.out.println("You couldn't get items[" + i + "]. The index is out of bounds of the array!");
			return null;
		} else {
			return items[i];
		}
	}

	public T getLast() {
		int index = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				index = i - 1;
				break;
			}
		}
		return items[index];
	}

	public T getFirst() {
		return items[0];
	}

	public void printArraySize() {
		System.out.println("Array size = " + items.length);
	}

	public void printLastFilledElementIndex() {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				System.out.println("Last filled element index = " + (i - 1));
				break;
			}
		}
	}

	public void remove(int i) {
		if (i < 0 || i >= items.length) {
			System.out.println("items[" + i + "] couldn't be romoved. The index is out of bounds of the array!");
		} else {
			if (i == items.length - 1) {
				items[i] = null;
			} else {
				for (int j = i; j < items.length - 1; j++) {
					items[j] = items[j + 1];
				}
				items[items.length - 1] = null;
			}
		}
	}

	public void remove(T obj) {
		if (obj.equals(items[items.length - 1])) {
			items[items.length - 1] = null;
		} else {
			boolean isMoveObject = false;
			boolean isObjectFound = false;
			for (int i = 0; i < items.length - 1; i++) {
				if (!isObjectFound && items[i].equals(obj)) {
					isMoveObject = true;
					isObjectFound = true;
				}
				if (isMoveObject) {
					items[i] = items[i + 1];

				}
			}
			if (isMoveObject) {
				items[items.length - 1] = null;
			} else {
				System.out.println("There's no such object in the array");
			}
		}
	}

	public void expand() {
		T[] temp = Arrays.copyOf(items, items.length * 2 + 1);
		items = temp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		for (T x : items)
			result = prime * result + ((x == null) ? 0 : x.hashCode());
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task2<T> other = (Task2<T>) obj;
		if (items != other.items)
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Task2 items = ");
		builder.append(Arrays.toString(items));
		return builder.toString();
	}
}
