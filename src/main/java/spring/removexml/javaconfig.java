package spring.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {
	
	@Bean
	public Address getAddress() {
		Address add = new Address();
		return add;
	}
	
	@Bean(name = {"student1","student2","temp"})
	public Student getStudent() {
		Student student = new Student(getAddress());
		return student;
	}
}
