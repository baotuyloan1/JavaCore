import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 5, 2023
 * @version 1.0
*/

public class BatchJob {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			es.execute(new Worker(Integer.valueOf(i).toString()));
		}
		
		es.shutdown();

	}
}
