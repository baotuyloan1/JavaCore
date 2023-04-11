/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Developer extends Employee {
	public void move() {
		System.out.println("Move from Employee");
	}

	@Override
	public void work(String location) {
		System.out.println("Working of Developer");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
