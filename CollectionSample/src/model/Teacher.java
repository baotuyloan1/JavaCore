/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 1, 2023
 * @version 1.0
*/
package model;

public class Teacher {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
