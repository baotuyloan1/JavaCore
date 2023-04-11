/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 28, 2023
 * @version 1.0
*/
package edu.fa;

public class Connection {
	public final String EMAIL ;

	public Connection() {
		EMAIL = "nguyenducbao@gmail.com";
	}
	public void sendEmail() {
		System.out.println("Sending email to " + EMAIL);
	}
}
