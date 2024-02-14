package employee;

public abstract class Employee 
{

	String name;
	String address;
	int salary;
	String jobtitle;
	
	public Employee(String name,String address,int salary,String jobtitle)
	{
		
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.jobtitle=jobtitle;
		
	}
	
	public abstract void bonus();
	
	public void getdetails()
	{
		System.out.println("Name:"+name+" Address:"+address+" Salary:"+salary+" Jobtitle:"+jobtitle);
	}
	
	public void report()
	{
		System.out.println("Employee status is good");
	}
	
	public abstract void project();
	

}
