import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class GenericCollection {
	public static void main(String[] args) {
//		generic cos the luu du lieu nho hon
//		List<Person> list = new ArrayList<Student>();
//		List<Person> list = new ArrayList<Teacher>();
		
		
//		java 7 có thể lượt bỏ đi, arraylist tự hiểu là arraylist<integer>. Cấu trúc không có data type trong <> gọi là dimond operator
		List<Integer> yearList = new ArrayList<>();
		
//		java 5,6
		List<Integer> list1 = new ArrayList<Integer>();
		yearList.add(2017);
		yearList.add(2018);
		yearList.add(2019);
		Integer number=  yearList.get(0);
		for (int i = 0; i < yearList.size(); i++) {
			
		}
		
		for (Integer i : yearList) {
			System.out.println(i);
		}
	}
}
