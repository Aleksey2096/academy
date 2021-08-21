package by.academy.homework5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class CustomIterator<T> implements Iterator<T> {
	private T[][] items;
	private int index;

	public CustomIterator() {
		super();
	}

	public CustomIterator(T[][] items) {
		this.items = items;
	}

	public T[][] getItems() {
		return items;
	}

	public void setItems(T[][] items) {
		this.items = items;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public boolean hasNext() {
		int arrQuantity = 0;
		for (int i = 0; i < items.length; i++) {
			arrQuantity += items[i].length;
		}
		if (arrQuantity < 1 || index > arrQuantity - 1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public T next() {
		int i = 0;
		int j = 0;
		if (index < items[0].length) {
			return items[0][index++];
		} else {
			for (int k = index, l = 0; k >= items[l].length && l < items.length;) {
				k -= items[l++].length;
				i = l;
				j = k;
			}
			index++;
			return items[i][j];
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(items);
		result = prime * result + Objects.hash(index);
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomIterator other = (CustomIterator) obj;
		return index == other.index && Arrays.deepEquals(items, other.items);
	}

	@Override
	public String toString() {
		return "CustomIterator [items=" + Arrays.toString(items) + ", index=" + index + "]";
	}
}
