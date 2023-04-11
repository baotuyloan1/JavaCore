import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/

public class ListSample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(2017);
		list.add("Fresher Academy");
		list.add(new Date());
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		for (int i = 0 ; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		Object object = list.get(1);
		Number number = (Integer) object;
	}
}
