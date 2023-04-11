import java.util.List;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 5, 2023
 * @version 1.0
*/

public class Enrollment implements Runnable {

	private List<Student> studentList;

	public Enrollment(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	@Override
	public void run() {
		if (studentList != null) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(studentList.size());;
		}
	}

}
