/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 24, 2023
 * @version 1.0
*/
package edu.fa.model;

public class Manager {
	private String name;
	
	public Manager() {
		System.out.println("Created without name");
	}
	public Manager(String name) {
		System.out.println("Created by "+ name);
	}
	

	public void report(Employee employee)throws Exception {
		System.out.println(employee.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void report (Developer developer) {
		developer.showName();
	}
	
}
