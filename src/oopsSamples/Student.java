package oopsSamples;

public abstract class Student 
{

	
	String name;
	String address;
	float gpa;
	
	static final String college="Muthayammal";
	
	private double average;
	
	public Student()
	{
		
	}
	
	public Student(String strName)
	{
		name=strName;
	}
	
//	public void goToClass()
//	{
//		
	
	public final double calculateCGP()
	{
		return 10.5;
	}
	
	public abstract void goToclass();
	
	
	public void goToClass(String direction)
	{
		
	}
	
	

}
