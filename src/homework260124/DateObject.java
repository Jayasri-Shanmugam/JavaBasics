package homework260124;

import java.util.Calendar;
import java.util.Scanner;

public class DateObject
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Calendar dates=Calendar.getInstance();
		int year=sc.nextInt();          
		dates.set(Calendar.YEAR,year);
		int month=sc.nextInt();
		dates.set(Calendar.MONTH, month);
		int date=sc.nextInt();
		dates.set(Calendar.DATE,date);
        System.out.println(dates.getTime());
sc.close();
	}

}
