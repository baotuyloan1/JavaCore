import java.time.Duration;
import java.time.LocalTime;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class StringPerformance {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		String link = "";
		for (int i = 0; i < 20000; i++) {
			link += i;
		}
		LocalTime finish = LocalTime.now();
		System.out.println("String append: " + Duration.between(start, finish));

		start = LocalTime.now();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
		finish = LocalTime.now();
		System.out.println("String builder append: " + Duration.between(start, finish));
	}
}
