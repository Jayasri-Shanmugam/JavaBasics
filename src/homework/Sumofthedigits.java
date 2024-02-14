package homework;

import java.util.Scanner;

public class Sumofthedigits {

	public static void main(String[] args)
	{

		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		if(num<0||num>1000)
		{
			System.out.println("Provide a number within the range of 0 to 1000");
		}
		else
		{
			int sum=0;
//			int Num=num;
			while(num>0)
			{
				int rem=num%10;
				sum+=rem;
				num/=10;
			}
			System.out.println("The sum is "+sum);
		}
		input.close();
		
	}

}
