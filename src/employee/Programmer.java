package employee;

public class Programmer extends Employee
{

	public void bonus()
	{
		System.out.println("Bonus of the programmer is 10 percent");
	}
	
	public void project()
	{
		System.out.println("Programmer can write code for the project");
	}
	
	public Programmer(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
	}
}
