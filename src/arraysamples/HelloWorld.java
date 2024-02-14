package arraysamples;

public class HelloWorld
{

	private String i="1";

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Hello,Welcome");
		
		HelloWorld obj=new HelloWorld();
		System.out.println("Value of i "+obj.i);
		
		System.out.println(obj.addition(28,05));
		System.out.println(HelloWorld.addition(03,02));
		

	}

	private static int addition(int num1, int num2)
	{
		// TODO Auto-generated method stub
		
		int sum=num1+num2;
		return sum;
	}

}
