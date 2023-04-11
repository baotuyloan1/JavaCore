import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class SetSample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(2020);
		set.add(2017);
		set.add(2018);
		set.add(2019);
		
		System.out.println(set.size());
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
