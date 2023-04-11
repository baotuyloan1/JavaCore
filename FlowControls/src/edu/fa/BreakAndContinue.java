/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

import java.util.Iterator;

public class BreakAndContinue {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 7, 9, 11 };
		for (int i = 0; i < numbers.length; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i + ":" + numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i + ":" + numbers[i]);
		}
	}
}
