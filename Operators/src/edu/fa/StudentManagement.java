/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class StudentManagement {
	public static void main(String[] args) {
		Object obj = new Student();

		System.out.println(obj instanceof Student);
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof String);
		Student student = (Student) obj;
		student.study();
	}
}
