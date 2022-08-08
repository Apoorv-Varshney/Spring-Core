package spring.removexml;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("Apoorv Varshney")
	private String name;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Student Class called ...");
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	
}
