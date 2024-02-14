package homework260124;

import java.util.Calendar;

public class Maximum 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Calendar calendar=Calendar.getInstance();
		
		System.out.println(calendar.getTime());
		
		System.out.println("Maximum year: "+calendar.getActualMaximum(Calendar.YEAR));
		System.out.println("Maximum month: "+calendar.getActualMaximum(Calendar.MONTH));
		System.out.println("Maximum week: "+calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Maximum date: "+calendar.getActualMaximum(Calendar.DATE));
		
	}

}
