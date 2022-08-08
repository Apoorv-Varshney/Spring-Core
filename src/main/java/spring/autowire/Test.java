package spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("awconfig.xml");
		Painter paint1 = (Painter) context.getBean("painter1");
		System.out.println(paint1);

		Painter paint2 = (Painter) context.getBean("painter2");
		System.out.println(paint2);

		Painter paint3 = (Painter) context.getBean("painter3");
		System.out.println(paint3);

	}

}
