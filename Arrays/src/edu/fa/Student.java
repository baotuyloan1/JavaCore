/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class Student {
	private String[] subjects = new String[3];
	private int[] marks = new int[3];
	public void displaySubjects() {
		System.out.println(subjects);
		System.out.println(subjects[2]);
		System.out.println(marks[2]);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.displaySubjects();
	}
}
