package main.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void testCreate() {
		final String firstStuentName = "Jane Doe";
		final String secondStudentName = "Joe Doe";
		
		Student firstStudent = new Student(firstStuentName);
		assertEquals(firstStuentName, firstStudent.getName());
		
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
		
		assertEquals(firstStuentName, firstStudent.name);
	}


}
