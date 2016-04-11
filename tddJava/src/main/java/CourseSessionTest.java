package main.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CourseSessionTest {
	private CourseSession session;

	public void setUp() {
		session = new CourseSession("ENGL", "101");
	}

	@Test
	public void testCreat() {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0,session.getNumberOfStudents());
	}

	@Test
	public void tetsEnrollStudents() {

		Student student1 = new Student("Cain");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		

		Student student2 = new Student("Coralee");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());

		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}
}
