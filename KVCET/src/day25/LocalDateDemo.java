package day25;
import java.time.*;

public class LocalDateDemo 
{

	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();
		
		System.out.println("Today's Date : "+today);
		
		LocalDate yesterday = today.minusDays(1);
		
		System.out.println("yseterday's Date :"+yesterday);
		
		
		LocalDate day = today.plusDays(2);
		
		System.out.println(day);
		
		LocalDate nextMonth = today.plusMonths(2);
		
		System.out.println(nextMonth);
		
		
		LocalDate date = LocalDate.of(2023, 04, 20);
		
		System.out.println(date.isLeapYear());

	}

}
