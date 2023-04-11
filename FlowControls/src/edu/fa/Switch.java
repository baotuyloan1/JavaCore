/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/
package edu.fa;

public class Switch {

	public static void main(String[] args) {
		int day = 4;
//		neen sắp xếp code từ nhỏ đến lớn và default ở cuối cùng
		switch (day) {
		default:
			System.out.println("Sun");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Thurs");
//			break;
		case 5:
			System.out.println("Fri");
//			break;
		case 6:
			System.out.println("Sat");
//			break;
		case 3:
			System.out.println("Wed");
//			break;

		}
	}

}
