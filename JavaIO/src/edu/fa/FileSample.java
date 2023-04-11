/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 2, 2023
 * @version 1.0
*/
package edu.fa;

import java.io.File;
import java.io.IOException;

public class FileSample {
	public static void main(String[] args) throws IOException {

		File file = new File("D:/data/input.txt");
		
//		taoj file trong thư mực trên
		file.createNewFile();
		
//		Tao thu muc
		File dir = new File("D:/data/tmp");
		dir.mkdirs();
		
		System.out.println(file.exists());
		System.out.println(dir.exists());
		
		file.delete();
		System.out.println(file.exists());
		
		
	}
}
