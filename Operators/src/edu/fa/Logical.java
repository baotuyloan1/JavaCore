/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class Logical {
	public static void main(String[] args) {
		int a = 6;
		int b = 10;
		System.out.println(a > 7 & b > 9);
		System.out.println(a > 5 & b > 9);
		System.out.println(a > 7 | b > 11);
		System.out.println(a > 5 | b > 11);
	}
}
