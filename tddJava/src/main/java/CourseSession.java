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

	public int getNumberOfStudents() {
		return numberOfStudent;
	}

	public void enroll(Student student) {
		numberOfStudent = numberOfStudent+1;
		students.add(student);
	}
	
	ArrayList<Student> getAllStudents() {
		return students;
	}
}
