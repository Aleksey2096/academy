package by.academy.homework3;

public class Bread extends Product {
	private String type;
	private boolean isSliced;

	public Bread() {
		super();
	}

	public Bread(String title, long quantity, long index, double price, double weight, String type, boolean isSliced) {
		super(title, quantity, index, price, weight);
		this.type = type;
		this.isSliced = isSliced;
	}

	public double getDiscount() {
		double discount = 0;
		if (!isSliced) {
			discount = 0.15;
		}
		return discount;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setIsSliced(boolean isSliced) {
		this.isSliced = isSliced;
	}

	public boolean getIsSliced() {
		return isSliced;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
