package by.academy.homework3;

public class Beer extends Product {
	private double volume;
	private double abvPercent;

	public Beer() {
		super();
	}

	public Beer(String title, long quantity, long index, double price, double weight, double volume,
			double abvPercent) {
		super(title, quantity, index, price, weight);
		this.volume = volume;
		this.abvPercent = abvPercent;
	}

	public double getDiscount() {
		double discount = 0;
		if (volume > 1.5) {
			discount = 0.3;
		}
		return discount;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setAbvPercent(double abvPercent) {
		this.abvPercent = abvPercent;
	}

	public double getAbvPercent() {
		return abvPercent;
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
