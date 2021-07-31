package by.academy.homework3;

public class Wine extends Product {
	private double volume;
	private double abvPercent;
	private String colour;

	public Wine() {
		super();
	}

	public Wine(String title, long quantity, long index, double price, double weight, double volume, double abvPercent,
			String colour) {
		super(title, quantity, index, price, weight);
		this.volume = volume;
		this.abvPercent = abvPercent;
		this.colour = colour;
	}

	public double getDiscount() {
		double discount = 0;
		if (abvPercent > 10) {
			discount = 0.2;
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

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
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
