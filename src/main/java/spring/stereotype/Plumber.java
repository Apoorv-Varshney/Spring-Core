package spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj")
@Scope("prototype")
public class Plumber {

	@Value("#{34+56}")
	private int id;
	
	@Value("#{new String('Ashu')}")
	private String name;
	
	@Value("#{phone}")
	private List<String> phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Plumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Plumber [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
