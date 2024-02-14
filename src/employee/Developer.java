package employee;

public class Developer extends Employee
{

	public void bonus()
	{
		System.out.println("Bonus of the developer is 20 percent");
	}
	
	public void project()
	{
		System.out.println("Developer will develop the project");
	}
	
	public Developer(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
	}
}
