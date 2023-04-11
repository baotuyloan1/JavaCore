/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 1, 2023
 * @version 1.0
*/
package model;

public class Student implements Comparable<Student> {

	private String name;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public Student() {

	}
	
	@Override
	public String toString() {
		return name + " - " + grade;
	}

	@Override
	public int compareTo(Student o) {
//		So sanh theo ten
//		return this.name.compareTo(o.getName());
		return Integer.valueOf(this.grade).compareTo(o.grade);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return this.name.equals(student.getName()) && this.grade == student.grade;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.grade;
	}
}
