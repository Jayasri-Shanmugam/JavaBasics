package homework;

import java.util.Scanner;

public class Inches_to_Meter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double inch=input.nextDouble();
		double meter=inch*0.0254;
		System.out.println(inch+" inch is equal to "+meter+"meter");
		input.close();
		

	}

}
