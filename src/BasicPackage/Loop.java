package BasicPackage;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int num=sc.nextInt();
		if(num>=0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Negative number");
		}
		int data=sc.nextInt();
		while(data>=0)
		{
			data+=num;
			break;
		}
		System.out.println(data);
		sc.close();
	}

}
