package spring.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int employeeId;
	private String employeeName;
	private List<String> employeeSkills;
	private Set<String> employeeNumber;
	private Map<String, Integer> employeeTiming;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(List<String> employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	

	public Set<String> getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Set<String> employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public Map<String, Integer> getEmployeeTiming() {
		return employeeTiming;
	}

	public void setEmployeeTiming(Map<String, Integer> employeeTiming) {
		this.employeeTiming = employeeTiming;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSkills="
				+ employeeSkills + ", employeeNumber=" + employeeNumber + ", employeeTiming=" + employeeTiming
				+ ", address=" + address + "]";
	}

	public Employee(int employeeId, String employeeName, List<String> employeeSkills, Set<String> employeeNumber,
			Map<String, Integer> employeeTiming, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSkills = employeeSkills;
		this.employeeNumber = employeeNumber;
		this.employeeTiming = employeeTiming;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
