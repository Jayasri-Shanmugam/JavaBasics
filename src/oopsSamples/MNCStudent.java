package oopsSamples;

public class MNCStudent extends Student implements ScoreInterface,AttendanceInterface
{

	public MNCStudent(String strName)
	{
		name=strName;
//		System.out.println(name);
	}
	public void goToclass()
	{
		System.out.println("Go to class after collecting Evaluating...");
	}
	@Override
	public int attendance() {
		// TODO Auto-generated method stub
		return 28;
	}
	@Override
	public int getscore() {
		// TODO Auto-generated method stub
		return 05;
	}
}
