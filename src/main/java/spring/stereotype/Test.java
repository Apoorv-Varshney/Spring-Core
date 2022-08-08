package spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context= new ClassPathXmlApplicationContext("stconfig.xml");
		 Plumber pb = context.getBean("obj",Plumber.class);
		 System.out.println(pb);
		 System.out.println(pb.hashCode());
	}

}
