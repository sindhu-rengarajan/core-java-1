package JavaCollectionsAdvanced;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = LocalDate.now().getMonthValue();
		int year = LocalDate.now().getYear();
		int day = LocalDate.now().getDayOfMonth();
		System.out.println(day);

		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalDate.now().getDayOfMonth());
		System.out.println(java.time.LocalDate.now().getDayOfYear());
		System.out.println(java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		
	}

}
