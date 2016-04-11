package main.java;

import java.util.ArrayList;

public class CourseSession {
	private String department;
	private String number;
	private int numberOfStudent;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
		numberOfStudent = 0;
	}

	String getDepartment() {
		return department;
	}

	String getNumber() {
		return number;
	}
	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student) {
		numberOfStudent = numberOfStudent+1;
		students.add(student);
	}
	public Student get(int index) {
		return students.get(index);
	}

}
