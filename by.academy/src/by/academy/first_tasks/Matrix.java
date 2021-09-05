package by.academy.first_tasks;

public class Matrix<T> {
	public void createMatrix(T o) {
		if (o instanceof Number) {
			Double d=Double.valueOf(o.toString());
			for (int i = 0; i < 100; i++) {
				System.out.print(d*2 + " ");
				if ((i + 1) % 10 == 0) {
					System.out.println();
					d+=1;
				}
			}
		} else if (o instanceof Boolean) {
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					System.out.print(o + " ");
				} else {
					System.out.print(!(Boolean) o + " ");
				}
				if ((i) % 10 == 0) {
					System.out.println();
				}
			}
		} else if (o instanceof Character) {
			Character c=Character.valueOf((char)o);
			for (int i = 0; i < 100; i++) {
				System.out.print((char)(c+1) + " ");
				if ((i + 1) % 10 == 0) {
					System.out.println();
					c=(char) (c+1);
				}
			}
		}else if (o instanceof String) {
			StringBuilder s=new StringBuilder((String)o);
			for (int i = 0; i < 100; i++) {
				System.out.print(s.reverse() + " ");
				if ((i + 1) % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
