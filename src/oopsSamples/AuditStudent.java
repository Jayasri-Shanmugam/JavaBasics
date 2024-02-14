package oopsSamples;

public class AuditStudent extends Student
{
     
	public AuditStudent(String strName)
	{
		name=strName;
	}
	
	public void goToclass()
	{

	}
	
	public void goToClass(String direction)
	{
		System.out.println("Go to class after Audit completion");
		System.out.println("The class is in "+direction);
	}
	
}
