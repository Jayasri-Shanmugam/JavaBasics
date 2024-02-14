package homework260124;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Difference
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
//		SimpleDateFormat input=new SimpleDateFormat("dd-MMM-yyyy");
		
		String Date1=sc.nextLine();
		String Date2=sc.nextLine();
		
		LocalDate date1 = LocalDate.parse(Date1);
        LocalDate date2 = LocalDate.parse(Date2);
		
		Period diff=Period.between(date1,date2);
		
		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());

		sc.close();
	}

}
