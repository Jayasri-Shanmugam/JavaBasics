package homework;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int rows=input.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)//space
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)//number
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

		input.close();
		
	}

}
