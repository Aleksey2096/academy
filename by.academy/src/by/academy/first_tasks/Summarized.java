package by.academy.first_tasks;

import java.io.Serializable;

public class Summarized<T extends Comparable<String>, V extends Serializable, K extends Number> {
	private T variable1;
	private V variable2;
	private K variable3;

	public Summarized(T variable1, V variable2, K variable3) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}

	public T getVariable1() {
		return variable1;
	}

	public V getVariable2() {
		return variable2;
	}

	public K getVariable3() {
		return variable3;
	}

	public void printClass(Object a,Object b,Object c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}
}
