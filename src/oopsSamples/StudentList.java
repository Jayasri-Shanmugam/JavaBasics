package oopsSamples;

import java.util.ArrayList;

public class StudentList
{

	ArrayList<Student> studList;;
	public StudentList()
	{
		System.out.println("Creating students list...");
		studList=new ArrayList<>();
		
	}
	
	public void addStudent(Student student)
	{
		System.out.println("Add students to list...");
		studList.add(student);
	}
	
	public ArrayList getStudents()
	{
		return studList;
	}
	
}
