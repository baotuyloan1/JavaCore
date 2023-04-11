/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0, j = 2; i++ < 10; i += j) {
			System.out.println(i);
		}
		int[] numbers = { 1, 3, 5, 7 };
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " - " + j);
			}
		}
	}
}
	