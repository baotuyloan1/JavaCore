import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Apr 3, 2023
 * @version 1.0
*/

public class PathSample {
	public static void main(String[] args) {
		Path path = Paths.get("D:/data");
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		Path p1 = Paths.get("data");
		Path p2 = Paths.get("student");
		System.out.println(p1.relativize(p2));
		
		System.out.println(p1.equals(p2));
	}
}
