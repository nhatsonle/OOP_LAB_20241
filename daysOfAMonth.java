package monthAndYear;
import java.util.Scanner;
public class daysOfAMonth {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int year;
		int month = 0;
		String monthCheck = "a";
		String[] validMonths1 = {"January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	};
		String[] validMonths2 = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June",
	            "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
		
		String[] validMonths3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11","12"};
		String[] validMonths4 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
	            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		boolean isValid = false;
		while(isValid == false)
		{
			System.out.print("Please enter a month: ");
			monthCheck = keyboard.nextLine();
			
			
			for(String validMonth : validMonths1)
			{
				if(monthCheck.equals(validMonth))
				{
					isValid = true;
					break;
				}
			}
			if(isValid == false)
			{
				for(String validMonth : validMonths2)
				{
					if(monthCheck.equals(validMonth))
					{
						isValid = true;
						break;
					}
				}
			}
			if(isValid == false)
			{
				for(String validMonth : validMonths3)
				{
					if(monthCheck.equals(validMonth))
					{
						isValid = true;
						break;
					}
				}
			}
			if(isValid == false)
			{
				for(String validMonth : validMonths4)
				{
					if(monthCheck.equals(validMonth))
					{
						isValid = true;
						break;
					}
				}
			}
		}
		
		switch(monthCheck)
		{
		case "January":
		case "Jan.":
		case "Jan":
		case "1":
			month = 1;
			break;
			
		case "February":
		case "Feb.":
		case "Feb":
		case "2":
			month = 2;
			break;
			
		case "March":
		case "Mar.":
		case "Mar":
		case "3":
			month = 3;
			break;
			
		case "April":
		case "Apr.":
		case "Apr":
		case "4":
			month = 4;
			break;
			
		case "May":
		case "5":
			month = 5;
			break;
			
		case "June":
		case "Jun":
		case "6":
			month = 6;
			break;
			
		case "July":
		case "Jul":
		case "7":
			month = 7;
			break;
			
		case "August":
		case "Aug.":
		case "Aug":
		case "8":
			month = 8;
			break;
			
		case "September":
		case "Sept.":
		case "Sep":
		case "9":
			month = 9;
			break;
			
		case "October":
		case "Oct.":
		case "Oct":
		case "10":
			month = 10;
			break;
			
		case "November":
		case "Nov":
		case "Nov.":
		case "11":
			month = 11;
			break;
			
		case "December":
		case "Dec.":
		case "Dec":
		case "12":
			month = 12;
			break;
			
		}
		
		System.out.print("Please enter a year: ");
		year = keyboard.nextInt();
		while(year <= 0)
		{
			System.out.println("Invalid year");
			year = keyboard.nextInt();
		}
		
		boolean leapYear = false;
		if(year % 4 == 0 && year % 100 != 0)
		{
			leapYear = true;
		}
		if(year % 400 == 0)
		{
			leapYear = true;
		}
		int daysInAMonth = 0;
		
		if(month == 1 || month == 3 || month == 5|| 
			   month == 7||month == 8||month == 10||month == 12)
			{
				daysInAMonth = 31;
			}
		if(month == 4||month == 6||
			month == 9||month == 11)
				{
					daysInAMonth = 30;
				}
				if(month == 2)
				{
					if(leapYear == true)
					{
						daysInAMonth = 29;
					}
					else
					{
						daysInAMonth = 28;
					}
				}
				
			
		System.out.println(daysInAMonth + " days");	
		System.exit(0);
		}
}
