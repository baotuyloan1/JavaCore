/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class StringPool {
	public static void main(String[] args) {
		String s1 = "Fresher";
		String s2 = "Fresher";
		String s5 = "Fresher";
		String s3 = "Academy";
		System.out.println(s1 + s3);
//		s1 + s3 nó cũng sẽ tạo ra 1 string mới nằm trong string pool
		
		String s4 = new String("Fresher");
		String s6 = s4.intern();
		System.out.println(s4.intern());
		
		System.out.println(s5 == s6);
		
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		
	}
}
