import java.util.Comparator;

import model.Student;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 1, 2023
 * @version 1.0
*/

public class ReverseStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}
