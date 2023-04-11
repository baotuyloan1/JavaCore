import java.util.concurrent.TimeUnit;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 5, 2023
 * @version 1.0
*/

public class Worker implements Runnable{

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	


	public Worker(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		int count = 0;
		while (count++ < 5) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.getName());
	}

}
