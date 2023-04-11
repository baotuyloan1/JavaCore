import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Student;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 1, 2023
 * @version 1.0
*/

public class CollectionSorting {

	public static void main(String[] args) {
		List<Integer> yearList = new ArrayList<>();
		yearList.add(2018);
		yearList.add(2017);
		yearList.add(2019);

		for (Integer i : yearList) {
			System.out.println(i);
		}

		Collections.sort(yearList);
		System.out.println("=========");
		for (Integer i : yearList) {
			System.out.println(i);
		}

		List<String> nameList = new ArrayList<>();
		nameList.add("Fresher");
		nameList.add("Academy");
		nameList.add("Baokey");
		System.out.println("=======");
		for (String name : nameList) {
			System.out.println(name);
		}
		System.out.println("=======");
		Collections.sort(nameList);
		for (String name : nameList) {
			System.out.println(name);
		}
		System.out.println("=======");
		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student("Chicken", 9));
		studentList.add(new Student("Hugo", 7));
		studentList.add(new Student("Baokey", 6));

		System.out.println(studentList);
		System.out.println("=======");
//		Collections.sort(studentList);

		Collections.sort(studentList,new StudentComparator());
		System.out.println(studentList);
		System.out.println("=======");
		Collections.sort(studentList,new ReverseStudentComparator());
		System.out.println(studentList);

	}
}
