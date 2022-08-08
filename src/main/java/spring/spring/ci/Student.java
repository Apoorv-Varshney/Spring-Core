package spring.spring.ci;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private List<String> subjects;
	private Address address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", subjects=" + subjects
				+ ", address=" + address + "]";
	}
	public Student(int studentId, String studentName, List<String> subjects, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjects = subjects;
		this.address = address;
	}

}
