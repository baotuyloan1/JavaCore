/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Manager {

	public static int numberOfProjects = 10;
	public String[] project;
	public static void addProjects() {
		numberOfProjects++;
		System.out.println("New number of projects "+numberOfProjects);
//		project = new String[numberOfProjects];
	}

	public static void main(String[] args) {
		System.out.println(Manager.numberOfProjects);
		Manager.addProjects();
		Manager projectManager = new Manager();
		Manager account = new Manager();
		System.out.println(projectManager.numberOfProjects);
		projectManager.addProjects();
		System.out.println(account.numberOfProjects);
		account.addProjects();
	}

}
