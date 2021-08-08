package by.academy.homework4;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorCustom<T> implements Iterator<T> {
	private T[] items;
	private int index;

	public IteratorCustom() {
		super();
	}

	public IteratorCustom(T[] items) {
		this.items = items;
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
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
		if (items.length < 2 || index > items.length - 2) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public T next() {
		return items[index++];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
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
		IteratorCustom<T> other =(IteratorCustom<T>) obj;
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
		builder.append("IteratorCustom items = ");
		builder.append(Arrays.toString(items));
		builder.append("; Index = " + index);
		return builder.toString();
	}
}
