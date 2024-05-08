package DateConcept;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LocalDate.now());
		
		System.out.println(java.time.LocalDateTime.now().getDayOfMonth());
		System.out.println(java.time.LocalDateTime.now().getMonthValue());
		System.out.println(java.time.LocalDateTime.now().getYear());
		
		System.out.println(java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		
		LocalDate x = java.time.LocalDate.of(1993, 8, 30);
		LocalDate y = java.time.LocalDate.of(2023, 8, 17);
		System.out.println(Period.between(x, y));

		
		java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
	}

}
