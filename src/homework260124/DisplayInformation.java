package homework260124;

import java.util.Calendar;

public class DisplayInformation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Calendar calendar=Calendar.getInstance();
		
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
	    int hour=calendar.get(Calendar.HOUR);
	    int hour24=calendar.get(Calendar.HOUR_OF_DAY);
	    int minute=calendar.get(Calendar.MINUTE);
	    
	    System.out.println("Year: "+year);
	    System.out.println("Month: "+month);
	    System.out.println("Date: "+date);
	    System.out.println("Hour: "+hour);
	    System.out.println("Hours in 24hrs format: "+hour24);
	    System.out.println("Minutes: "+minute);

	}

}
