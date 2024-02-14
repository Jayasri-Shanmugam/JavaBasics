package oopsSamples;

public class PayStudent extends Student implements ScoreInterface
{

	public PayStudent(String strName)
	{
		name=strName;
	}
	public void goToclass()
	{
		System.out.println("Go to class Directly....");
	}
	@Override
	public int getscore() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
