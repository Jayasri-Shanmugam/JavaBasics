package homework260124;

import java.util.Calendar;

public class MonthsLeft
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Calendar calendar=Calendar.getInstance();
		
		System.out.println(calendar.getTime());
		
		int presentmonth=calendar.get(Calendar.MONTH);
		
		System.out.println("The number of months left is: "+(11-presentmonth));

	}

}
