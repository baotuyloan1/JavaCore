/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 2, 2023
 * @version 1.0
*/

public class ThrowAndThrows {
	public static void main(String[] args) {
		ThrowAndThrows tat = new ThrowAndThrows();
		try {
			tat.checkStatus();
			tat.connectDatabase();
		} catch (EducationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void connectDatabase() throws Exception {
//		Connect database 

		throw new Exception();
	}

	public void checkStatus() throws EducationException {
		// Check status
		throw new EducationException("Out of slot");
	}
}
