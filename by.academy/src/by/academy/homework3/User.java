package by.academy.homework3;

import java.util.Date;

public class User {
	private String name;
	private String country;
	private Date dateOfBirth;
	private String phone;
	private String email;

	public User() {
		super();
	}

	public User(String name, String country, Date dateOfBirth, String phone, String email) {
		this.name = name;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
