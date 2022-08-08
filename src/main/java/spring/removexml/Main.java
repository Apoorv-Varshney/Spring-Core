package spring.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
		 Student st = context.getBean("temp",Student.class);
		 System.out.println(st);
		 st.display();
	}

}
