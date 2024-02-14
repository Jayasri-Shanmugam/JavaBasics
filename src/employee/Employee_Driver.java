package employee;

//import java.util.Scanner;

public class Employee_Driver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Employee m_id1=new Manager("Sri","Salem",8000,"Quality Engineer");
		Employee d_id1=new Developer("Ananth","Attur",35000,"Java Full Stack Developer");
		Employee p_id1=new Programmer("Sujitha","Paithur",16000,"Front end developer");

		m_id1.bonus();
		m_id1.project();
		m_id1.report();
		m_id1.getdetails();
		System.out.println();
	     
		d_id1.bonus();
		d_id1.project();
		d_id1.report();
		d_id1.getdetails();
		System.out.println();
		
		p_id1.bonus();
		p_id1.project();
		p_id1.report();
		p_id1.getdetails();
		System.out.println();
		
	}

}
