package by.academy.homework3;

import java.time.LocalDate;
import java.util.Date;

public class Deal {
	private Date date;
	private Product[] products = new Product[100];
	private User seller;
	private User buyer;
	private LocalDate deadlineDate = LocalDate.now();

	public Deal() {
		super();
	}

	public Deal(Date date, Product[] products, User seller, User buyer) {
		this.date = date;
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
	}

	public double countFullPrice() {
		double fullPrice = 0;
		for (Product x : products) {
			try {
				x.equals(null);
			} catch (java.lang.NullPointerException e) {
				break;
			}
			fullPrice += x.countPrice();
		}
		return fullPrice;
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Product[] getProducts() {
		return products;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
