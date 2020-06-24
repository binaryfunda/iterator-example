package org.iteratorexample.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.iteratorexample.model.Student;

public class EnumerationAndIteratorExample {

	public static void main(String args[]) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "RAM"));
		studentList.add(new Student(1, "SHAM"));
		studentList.add(new Student(1, "ANDY"));
		studentList.add(new Student(1, "ALI"));

		// @@@@@@Enumeration Example@@@@@@//

		Enumeration<Student> e = Collections.enumeration(studentList);
		System.out.println("Enumeration Example");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement().getName());
		}
		// @@@@@@Enumeration Example@@@@@@//

		// @@@@@@Iterator Example@@@@@@//

		Iterator<Student> i = studentList.iterator();
		System.out.println("Enumeration Example");
		while (i.hasNext()) {
			System.out.println(i.next().getName());
		}
		// @@@@@@Iterator Example@@@@@@//
	}

}
