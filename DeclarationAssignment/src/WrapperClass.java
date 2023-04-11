/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/

public class WrapperClass {
	public static void main(String[] args) {
		int year = 2017;
		Integer number = 2020; 
		Integer number1 = new Integer(2020);
		Integer number2 = year; //autoboxing convert int to wrapper class
		year = number; //unboxing
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String y = "2020";
		System.out.println(Integer.parseInt(y));
		year = Integer.parseInt(y);
		
//		tràn bộ nhớ nó sẽ quay về lại giá trị nhỏ nhất. thì ta ép kiểu cho nó để nó không bị tràn bộ nhớ
//	    vòng tròn giá trị
		long l = (long)Integer.MAX_VALUE + 1;
		System.out.println(l);
	}
}
