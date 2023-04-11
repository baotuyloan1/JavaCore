import model.Student;
import model.Teacher;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 1, 2023
 * @version 1.0
*/

public class GenericClass {
	public static void main(String[] args) {
		DataAccess<Student> studentDataAccess = new DataAccess<>();
		studentDataAccess.update(new Student());
	
		
		DataAccess<Teacher> teacherDataAccess = new DataAccess<>();
		teacherDataAccess.update(new Teacher("Bao"));
	}
}
