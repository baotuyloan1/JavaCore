/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class LogicalOperators {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("pratice with && - &");
		if (a++ > 5 & b++ > 10) {
			System.out.println("true");
		}
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a = 5;
		b = 10;
		if (a++ > 5 && b++ > 10) {
			System.out.println("true");
		}
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		System.out.println("Practice with || - |");
		a = 5;
		b = 10;
		if (a-- > 3 || b-- > 9) {
			System.out.println("True");
		}
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a = 5;
		b = 10;
		if (a-- > 3 | b-- > 9) {
			System.out.println("True");
		}
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
