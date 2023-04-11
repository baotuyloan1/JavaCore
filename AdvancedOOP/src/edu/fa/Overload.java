/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Overload {
	public static void main(String[] args) {
		Student student = new Student();
		student.study(false);
		student.study("Java");
		student.move();
		student.move("Da Nang");
		Student student1 = new Student("Baokey");
	}
}
