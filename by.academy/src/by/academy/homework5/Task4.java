package by.academy.homework5;

import java.util.ArrayList;
import java.util.Objects;

public class Task4<T> {
	private ArrayList<T> markList = new ArrayList<>();

	public Task4() {
		super();
	}

	public Task4(ArrayList<T> markList) {
		this.markList = markList;
	}

	public ArrayList<T> getMarkList() {
		return markList;
	}

	public void setMarkList(ArrayList<T> markList) {
		this.markList = markList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(markList);
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
		Task4 other = (Task4) obj;
		return Objects.equals(markList, other.markList);
	}

	@Override
	public String toString() {
		return "Task4 [markList=" + markList + "]";
	}
}
