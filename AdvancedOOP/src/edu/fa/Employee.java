/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Employee extends Person {

	public void work (String location) {
		System.out.println("Working at "+location);
	}
	
	@Override
	public void move() {
		System.out.println("Move from Person");
	}

}
