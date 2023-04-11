import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 2, 2023
 * @version 1.0
*/

public class CheckedExceptionSample {
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(1000);

		try {
			Files.createFile(Paths.get("students.txt"));
		} 
		catch (FileAlreadyExistsException e) {
//			e.printStackTrace();
			System.out.println("File already Exists: "+e.toString());
		}catch (IOException e) {
//			e.printStackTrace();
			System.out.println("exception: "+e.toString());
		}finally {
			System.out.println("Always executed");
		}
		
		try {
			
		} finally {
			System.out.println("Always executed try finally");
		}
		System.out.println("After exception");
	}
}
