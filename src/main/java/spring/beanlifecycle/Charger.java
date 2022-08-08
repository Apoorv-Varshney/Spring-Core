package spring.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Charger {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Charger [price=" + price + "]";
}

public Charger() {
	super();
	// TODO Auto-generated constructor stub
}

@PostConstruct
public void init() {
	System.out.println("init method annotation");
}

@PreDestroy
public void destroy() {
	System.out.println("destroy method annotation");
}

}
