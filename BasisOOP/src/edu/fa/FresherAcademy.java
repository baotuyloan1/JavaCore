/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 24, 2023
 * @version 1.0
*/
package edu.fa;

import edu.fa.model.Employee;
import edu.fa.model.Manager;

public class FresherAcademy {
	public static void main(String[] args) {
		Manager manager = new Manager("Bao");
		System.out.println(manager);
		Manager manager1 = new Manager();
		System.out.println(manager1);
	}
}

