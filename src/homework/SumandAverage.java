package homework;

import java.util.Scanner;

public class SumandAverage 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int num = 0,sum=0;
		
		for(int i=0;i<5;i++)
		{
			 num=input.nextInt();
			 sum+=num;
		}
		
		int average=sum/num;
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+average);
		
		input.close();

	}

}
