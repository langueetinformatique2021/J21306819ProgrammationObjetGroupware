package tp07;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregDate = new GregorianCalendar();
		Date date = new Date();
		System.out.println("Date avec la classe GregorianCalendar : " + gregDate.getTime());
		//System.out.println("Date avec la classe Date : " + date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900) + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		System.out.println("Date avec la classe Date : " + date.toString());
	}

}
