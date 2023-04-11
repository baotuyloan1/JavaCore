/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class WhileLoop {
	public static void main(String[] args) {
		int[] ages = { 20, 22, 24, 25, 28, 30, 35, 40, 42, 45 };
		int index = 0;
		while (ages[index] < 35) {
			/*
			 * System.out.println(ages[index]); index++;
			 */
			System.out.println(ages[index++]);
			;
		}
	}
}
