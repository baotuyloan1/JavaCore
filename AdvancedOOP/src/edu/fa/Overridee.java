/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Overridee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.move();
		Developer dev = new Developer();
		dev.move();
	}
}
