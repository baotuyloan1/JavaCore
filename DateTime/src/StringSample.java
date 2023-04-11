/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class StringSample {
	public static void main(String[] args) {
		String s1 = "Fresher";
		System.out.println(s1);
		
		String s2 = new String(" Academy ");
		System.out.println(s2);
		
		String year = "2017";
		Integer.parseInt(year);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
//		Lấy kí tự từ vị trí 3 đến 6
		System.out.println(s1.substring(3,6));
		
//		Lấy kí tự từ vị trí 3 đến hết
		System.out.println(s1.substring(3));
		
//		Cắt kí tự dùng split
		String[] split = s1.split("e");
		System.out.println(split.length);
		System.out.println(split[2]);
		
//		hàm trim dùng để cắt bỏ space ở đầu và cuối
		System.out.println(s2.trim());
	}
}
