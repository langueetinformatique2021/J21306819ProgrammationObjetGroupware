package tp07;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gregDate = new GregorianCalendar();
		Date date = new Date();
		System.out.println("Date avec la classe GregorianCalendar : " + gregDate.getTime());
		//System.out.println("Date avec la classe Date : " + date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900) + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		System.out.println("Date avec la classe Date : " + date.toString());
		
		String str = sc.nextLine();
		System.out.println("Date et heure : " + gregDate.getTime());
	}

}
