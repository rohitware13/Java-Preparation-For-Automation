package practice_24;

import java.time.*;

public class DiffBet2Dates {
	
	public static void main(String[] args) {
		
		LocalDate start_date
        = LocalDate.of(2018, 01, 10);
		
		LocalDate end_date
        = LocalDate.of(2020, 10, 12);
		
		Period pr = Period.between(start_date, end_date);
		
		System.out.println(pr.getYears());
		System.out.println(pr.getMonths());
		System.out.println(pr.getDays());
		System.out.println(pr.toTotalMonths());
		

	}

}
