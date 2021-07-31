package by.academy.homework3;

public abstract class Product {
	private String title;
	private long index;
	private long quantity;
	private double price;
	private double weight;

	public Product() {
		super();
	}

	public Product(String title, long quantity, long index, double price, double weight) {
		this.title = title;
		this.quantity = quantity;
		this.index = index;
		this.price = price;
		this.weight = weight;
	}

	public abstract double getDiscount();

	public double countPrice() {
		return (1 - getDiscount()) * quantity * price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public long getIndex() {
		return index;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Title: \"" + this.title + "\", Quantity: \"" + this.quantity + "\", Index: \"" + this.index
				+ "\", Price: \"" + this.price + "\", Weight: \"" + this.weight + "\"";
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
