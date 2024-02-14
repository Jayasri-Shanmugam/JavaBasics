package employee;

public class Manager extends Employee
{

	public void bonus()
	{
		System.out.println("Bonus of the manager is 30 percent");
	}
	
	public void project()
	{
		System.out.println("Manager will manage the project");
	}
	
	public Manager(String name,String address,int salary,String jobtitle)
	{
		super(name,address,salary,jobtitle);
	}
	
}
