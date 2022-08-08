package spring.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Airpods implements InitializingBean,DisposableBean{
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Airpods [price=" + price + "]";
}

public Airpods() {
	super();
	// TODO Auto-generated constructor stub
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroy method");
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Init method");
}

}
