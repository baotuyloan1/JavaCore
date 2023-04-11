/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 26, 2023
 * @version 1.0
*/

public class FresherAcademy {
//	Global Variables
	private String name = "Fresher Academy";
	private int numberOfStudent;
	
	public void checkVariables() {
		System.out.println("Name: "+name);
		System.out.println("Name of student: "+numberOfStudent);
	}
	
	public int getNumberOfStudents() {
//		Local variables
		int numberOfStudent = 0;
		Student student = new Student() ;
		System.out.println(student);
		return numberOfStudent;
	}
	public static void main(String[] args) {
		FresherAcademy fa = new FresherAcademy();
		fa.checkVariables();
	}
}
