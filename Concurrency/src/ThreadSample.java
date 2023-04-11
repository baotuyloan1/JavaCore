/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 3, 2023
 * @version 1.0
*/

public class ThreadSample {
	public static void main(String[] args) {
		CustomerThread ct = new CustomerThread();
		CustomerThread ct1 = new CustomerThread();
		ct1.setName("B");
		ct.setName("A");
		ct1.start();
		ct.start();
		System.out.println(ct.isAlive());
	}
}

class CustomerThread extends Thread {
	@Override
	public void run() {
		int count = 0;
		while (count++ < 5) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.format("Customer Thread %s is running %d\n", this.getName(),count);
		}
		System.out.println(this.isAlive());

	}
}
