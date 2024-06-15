/**
 * Name: Naylene Rondon
 * 
 * Florida Tech CIS 2503
 * 7.6 Programming Assignment
 * 
 * Date Last Modified: 2/23/24
 * 
 * Purpose:
 * Lists holidays including birthday and compares their dates
 */
//imports
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;

public class CalendarHelper 
{
	
	public static void main(String[]args) throws ParseException //main
	{
		
		// Variables
		Date today = new Date();
		Date holidayDate = new Date();
		long shortestDays = 365; //To see which holiday is soonest
		String shortestName = "";

		String [] [] holidays = {
				{"12/25/2024","Christmas"},
				{"10/31/2024","Halloween"},
				{"02/14/2025","Valentine"},
				{"01/01/2025","New Years"},
				{"11/11/2024","Veteran"},
				{"01/01/2021","Birthday"}
				};
		
		//Format
		SimpleDateFormat dateFormat = new SimpleDateFormat ("E MMM dd, yyyy"); //Formats the days without time
		SimpleDateFormat inputFormat = new SimpleDateFormat ("MM/dd/yyyy", Locale.ENGLISH); //for input to be parsed
		//Scanner
		Scanner input = new Scanner(System.in);		
		
		 
		//input and current date
		System.out.println("Current date is " + dateFormat.format(today)); 
		System.out.println("What is your birthday? Use MM/dd/yyyy format"); //Takes in Birthday value
		String birthday = input.nextLine();
		holidays[5][0] = birthday;
		holidayDate = inputFormat.parse(holidays[5][0]);
		System.out.println("Your " + holidays[5][1] +" is " + dateFormat.format(holidayDate)); 
		
		//adjust the birthdate value for this coming year
		holidayDate.setYear(124);
		if(today.compareTo(holidayDate) > 0) // if birthday has passed, adjust for upcoming birthday
		{
			holidayDate.setYear(125);
		}
		
		shortestDays = daysBetween(today.getTime(), holidayDate.getTime()); //Establish birthday as closest to establish a beginning value to compare in loop
		shortestName = holidays[5][1];
		
		//Output updated birthday info
		System.out.println("Your next birthday is " + dateFormat.format(holidayDate));
		System.out.println("It is " + shortestDays + " days away."); 
		
		
		
		//output
		for (int i = 0; i < holidays.length-1; i++) //Exempts Birthday in loop
		{
			holidayDate = inputFormat.parse(holidays[i][0]);
			//output
			System.out.println(holidays[i][1] +" day is " + dateFormat.format(holidayDate)); 
			long daysBetween = daysBetween(today.getTime(), holidayDate.getTime());
			System.out.println("It is " + daysBetween + " days away."); 
			
			if (daysBetween < shortestDays) //updates closest holiday
			{
				shortestDays = daysBetween;
				shortestName = holidays[i][1];
			}
		}
		
		System.out.println("The closest holiday is " + shortestName);
		System.out.println("It is only " + shortestDays + " days away.");

	}
	
	public static long daysBetween(long day1, long day2)  //Changes millseconds into days
	{
		 long diffMill = Math.abs(day2 - day1); 
		 long diffDays = TimeUnit.DAYS.convert(diffMill, TimeUnit.MILLISECONDS);
		 return diffDays;
		 
	}
}
