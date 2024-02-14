package homework260124;

import java.util.Calendar;

public class Minimum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
Calendar calendar=Calendar.getInstance();
		
		System.out.println(calendar.getTime());
		
		System.out.println("Minimum year: "+calendar.getActualMinimum(Calendar.YEAR));
		System.out.println("Minimum month: "+calendar.getActualMinimum(Calendar.MONTH));
		System.out.println("Minimum week: "+calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
		System.out.println("Minimum date: "+calendar.getActualMinimum(Calendar.DATE));

	}

}
