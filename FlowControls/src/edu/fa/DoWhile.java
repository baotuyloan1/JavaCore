/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 2000;
		do {
			System.out.println("Please input a year after 2000:");
			year = scan.nextInt();
		} while (year <= 2000);
		System.out.println("Year value: " + year);
		scan.close();
	}

}
