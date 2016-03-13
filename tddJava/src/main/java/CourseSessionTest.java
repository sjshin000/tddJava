package main.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CourseSessionTest {

	@Test
	public void tetsEnrollStudents() {
		CourseSession session = new CourseSession("ENGL", "101");
		
		Student student1 = new Student("Cain");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		
		ArrayList<Student> allStudents = session.getAllStudents();
		assertEquals(1, allStudents.size());
		assertEquals(student1, allStudents.size());
		
		Student student2 = new Student("Coralee");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
	}
}
