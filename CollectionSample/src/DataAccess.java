/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 1, 2023
 * @version 1.0
*/

public class DataAccess<T> {
	public <E> void save(T t, E e) {
		System.out.println(t);
	}

	public void update(T t) {
		System.out.println(t);
	}
}
