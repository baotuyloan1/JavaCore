import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class MapSample {
	public static void main(String[] args) {
		Map<Integer, String> rsMap = new HashMap<>();
		rsMap.put(2017, "Good");
		rsMap.put(2018, "Excellent");
		rsMap.put(2019, "Good");

		System.out.println(rsMap.size());
		String rs = rsMap.get(2017);
		System.out.println(rs);

		Set<Integer> keySet = rsMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		Integer key = 0;
		while (iterator.hasNext()) {
			key = iterator.next();
			System.out.println(key + " " + rsMap.get(key));

		}
	}
}
