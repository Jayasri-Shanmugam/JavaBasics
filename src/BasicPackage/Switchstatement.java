package BasicPackage;
import java.util.Scanner;
public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int year=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Jan has 30 days");break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.println("Feb 29 days");
			else
				System.out.println("Feb 28 days");break;
		case 3:System.out.println("March has 30 days");break;
		case 4:System.out.println("April has 31 days");break;
		case 5:System.out.println("May has 30 days");break;
		case 6:System.out.println("June has 31 days");break;
		case 7:System.out.println("July has 30 days");break;
		case 8:System.out.println("August has 31 days");break;
		case 9:System.out.println("sep has 30 days");break;
		case 10:System.out.println("oct has 31 days");break;
		case 11:System.out.println("nov has 30 days");break;
		case 12:System.out.println("dec has 31 days");break;
		}
		sc.close();
	}

}
