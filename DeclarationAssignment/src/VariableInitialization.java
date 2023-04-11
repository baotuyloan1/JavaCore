/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 27, 2023
 * @version 1.0
*/

public class VariableInitialization {
	private String databaseConnection;
	private final String IP_ADDRESS = "127.0.0.1";

	public void checkVariables() {
		System.out.println(databaseConnection);

		System.out.println(IP_ADDRESS);
		int year = 2023;
		System.out.println(year);
	}
}
