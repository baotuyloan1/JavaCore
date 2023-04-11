/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 5, 2023
 * @version 1.0
*/

public class ThreadPriority {

	public static void main(String[] args) {
		EducationThread et1 = new EducationThread();
		et1.setName("A");
		et1.setPriority(Thread.MAX_PRIORITY);
		EducationThread et2 = new EducationThread();
		et2.setName("B");
		et2.setPriority(Thread.MIN_PRIORITY);
		EducationThread et3 = new EducationThread();
		et3.setName("C");
		et3.setPriority(Thread.NORM_PRIORITY);
		et1.start();
		et1.run();
		et2.start();
		et3.start();
	}

}

class EducationThread extends Thread {

	@Override
	public void run() {
		System.out.println(
				Thread.currentThread().getName() + " - " + this.getPriority() + " - " + this.getName());

	}
}
