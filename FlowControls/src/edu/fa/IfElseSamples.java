/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class IfElseSamples {
	public static void main(String[] args) {
		int year = 2017;
		int month = 8;
		if (year < 2015) {
			System.out.println("Before");
		}else if (year < 2020) {
			System.out.println("After 2015 and before 2020");
			if(month > 8) {
				System.out.println("Autumn");
			}else if(month < 4){
				System.out.println("Spring");
			}else {
				System.out.println("Summer");
			}
		}else {
			System.out.println("Else condition");
		}
	}
}
