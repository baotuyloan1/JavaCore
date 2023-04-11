/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Student extends Person {

	public Student() {
		System.out.println("Creating a new student");
	}
	
	public Student (String name) {
		System.out.println("Creating a new student with name "+name);
	}
	

	public void study(boolean active) {
		if (active) {
			System.out.println("I am studying");
		} else {
			System.out.println("I'm not studying");
		}

	}

	public void study(String subject) {
		Enrollment enrollment = new Enrollment();
		enrollment.enroll();
		System.out.println("I am studying " + subject);
	}

	@Override 
	public void move() {
		System.out.println("move method from Person");
	}

	public void move(String location) {
		System.out.println("I am moving to " + location);
	}


}
