/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/

public class GCEvaluation {

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("It is finalized...");

	}

	public static void main(String[] args) {
//		GCEvaluation gce1 = new GCEvaluation();
//		GCEvaluation gce2 = new GCEvaluation();
//		gce1 = null;
//		gce2 = null;
//		new GCEvaluation();
////		System.gc();
		Runtime.getRuntime().gc();
		int count = 0;
		System.gc();
		while (count++ < 5) {
			try {
				Thread.sleep(1000);
				System.out.println("Waiting...");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
