/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 24, 2023
 * @version 1.0
*/
package edu.fa.model;

public class Employee extends Person implements Member, Colleague{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
//		validate here
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println("Moving of Employee");
	}

	@Override
	public void showName() {
		System.out.println("Show employee name");
	}

	@Override
	public void work() {
		System.out.println();
	}
	
	@Override
	public void study() {
		super.study();
		System.out.println("Employee study");
	}
	
}
