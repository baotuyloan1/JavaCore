import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 3, 2023
 * @version 1.0
*/

public class FileSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/data/students");
		Files.createDirectories(path);

		Path studentFile = Paths.get("D:/data/students.txt");
		if (!Files.exists(studentFile)) {
			Files.createFile(studentFile);
		} else {
			System.out.println("File is existed");
		}

//		ghi file
		String school = "Fresher Academy ";
		byte[] data = school.getBytes();
		OutputStream out = null;
		try {
			out = new BufferedOutputStream(
					Files.newOutputStream(studentFile, StandardOpenOption.CREATE, StandardOpenOption.APPEND));
			out.write(data,0,data.length);
		} finally {
			if (out != null) {
				out.close();
			}
		}
		
//		doc file
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(Files.newBufferedReader(studentFile));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			if (br!=null)
				br.close();
		}
		
//		delete file and directory
		Files.deleteIfExists(studentFile);
		Files.deleteIfExists(path);
	}

}
