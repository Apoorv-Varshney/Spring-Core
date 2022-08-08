package spring.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext abContext = new ClassPathXmlApplicationContext("bconfig.xml");
		abContext.registerShutdownHook();
		Iphone iphone = (Iphone) abContext.getBean("XR");
		System.out.println(iphone);

		Airpods airpods = (Airpods) abContext.getBean("Pro");
		System.out.println(airpods);

		Charger charger = (Charger) abContext.getBean("Boat");
		System.out.println(charger);
	}
}
