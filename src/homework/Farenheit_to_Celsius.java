package homework;

import java.util.Scanner;

public class Farenheit_to_Celsius 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double temperature=input.nextDouble();
		
		//((temperature-32)*5)/9
		
		double celsius=((temperature-32)*5)/9;
		System.out.println(temperature+"°F is equal to "+celsius+"°C");
		
		input.close();

	}

}
