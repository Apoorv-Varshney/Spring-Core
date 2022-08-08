package spring.removexml;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("Diwani")
	private String street;
	@Value("Agra")
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
