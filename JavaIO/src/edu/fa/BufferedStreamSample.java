/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 2, 2023
 * @version 1.0
*/
package edu.fa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedStreamSample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("D:/data/input.txt"));
			pw = new PrintWriter(new FileWriter("D:/data/output.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				pw.println(line);
				
			}

		
		} finally {
			if (br != null) {
				br.close();
			}
			if (pw != null) {
				pw.close();
			}
		}

	}
}
