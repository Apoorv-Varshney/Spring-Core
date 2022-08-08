package spring.aw.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("annconfig.xml");
		Painter paint1 = (Painter) context.getBean("painter1");
		System.out.println(paint1);

	}

}
