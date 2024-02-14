package homework;

import java.util.Scanner;

public class MinutestoYearsandDays 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int mins=input.nextInt();
		double year_min=365*24*60;
		int year=(int)mins/(int)year_min;
		int days=(int)(mins/60/24)%365;
		System.out.println(mins+" minutes is equal to "+year+" years "+days+" days");
		input.close();
		
	}

}
