package spring.aw.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Painter {
	@Autowired
	@Qualifier("add3")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Painter(Address address) {
		super();
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Painter [address=" + address + "]";
	}

	public Painter() {
		super();
		// TODO Auto-generated constructor stub
	}

}
