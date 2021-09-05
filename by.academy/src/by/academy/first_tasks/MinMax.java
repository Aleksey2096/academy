package by.academy.first_tasks;

public class MinMax<T extends Number> {
	T[] arr;

	public MinMax(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public void getMin() {
		Long min = Long.MAX_VALUE;
		Double min1 = Double.MAX_VALUE;
		if (arr instanceof Double[] || arr instanceof Float[]) {
			for (int i = 0; i < arr.length; i++) {
				if (Double.valueOf(arr[i].toString()) < min1) {
					min1 = Double.valueOf(arr[i].toString());
				}
			}
			System.out.println("Minimal element value = " + min1);
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (Long.valueOf(arr[i].toString()) < min) {
					min = Long.valueOf(arr[i].toString());
				}
			}
			System.out.println("Minimal element value = " + min);
		}
	}

	public void getMax() {
		Long max = Long.MIN_VALUE;
		Double max1 = Double.MIN_VALUE;
		if (arr instanceof Double[] || arr instanceof Float[]) {
			for (int i = 0; i < arr.length; i++) {
				if (Double.valueOf(arr[i].toString()) > max1) {
					max1 = Double.valueOf(arr[i].toString());
				}
			}
			System.out.println("Maximal element value = " + max1);
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (Long.valueOf(arr[i].toString()) > max) {
					max = Long.valueOf(arr[i].toString());
				}
			}
			System.out.println("Maximal element value = " + max);
		}
	}
}
