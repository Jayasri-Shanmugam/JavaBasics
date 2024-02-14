package homework260124;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		SimpleDateFormat input=new SimpleDateFormat("dd-MMM-yyyy");
		
		String word=sc.nextLine();
		
		try
		{
			Date date=input.parse(word);
			System.out.println(date);
			System.out.println(input.format(date));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
sc.close();
	}

}
