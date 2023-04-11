import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * (C) Copyright 2023 Baokey
 *
 * @author BAO
 * @date Mar 29, 2023
 * @version 1.0
*/
//java 5,6,7
public class DateSample {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
//		Wed Mar 29 13:31:52 ICT 2023
//		Tính khoản cách 2 ngày sử dụng time
		System.out.println(date.getTime());
		System.out.println(date.getHours());
		System.out.println(date.before(new Date()));
		System.out.println(date.after(new Date()));
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH-mm");
//		convert date thành string theo format
		System.out.println(sdf.format(date));
//		convert string format to date 
		Date date2 = sdf.parse("25-Mar-2023 14-01");
		System.out.println(date2);
		System.out.println(sdf.format(date2));
	}
}
