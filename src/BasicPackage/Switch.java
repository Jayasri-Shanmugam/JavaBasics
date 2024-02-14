package BasicPackage;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		switch(days)
		{
		case 1,2,3,4,5:System.out.println("Workdays");
		case 6,7:System.out.println("Holidays");
		}
		sc.close();
	}

}
