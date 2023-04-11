/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 25, 2023
 * @version 1.0
*/
package edu.fa.model;

public abstract class Person {
	public abstract void move();
	
	public void study() {
		System.out.println("Person Study");
	}
}
