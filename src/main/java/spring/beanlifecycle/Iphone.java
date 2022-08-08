package spring.beanlifecycle;

public class Iphone {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Iphone [price=" + price + "]";
	}

	public void init() {
		System.out.println("Init method calling ...");
	}

	public void destroy() {
		System.out.println("Destroy method calling ...");
	}

}
