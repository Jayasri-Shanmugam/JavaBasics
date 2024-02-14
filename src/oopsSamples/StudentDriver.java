package oopsSamples;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub

		
//		Student s1=new Student("Sri");
//		s1.address="Chennai";
//		s1.gpa=8.8f;
//		
//		Student s2=new Student("Ananth");
//		s2.address="Attur";
//		s2.gpa=8.8f;
//		
//		System.out.println("Student 1:"+" "+s1.name+" "+s1.gpa+" "+s1.address);
//		System.out.println("Student 2:"+" "+s2.name+" "+s2.gpa+" "+s2.address);
//		
		Student mStud=new MNCStudent("Kartick");
		mStud.gpa=3.5f;
		
		MNCStudent mStud2=new MNCStudent("Jai");
		System.out.println(mStud2.getscore());
		System.out.println(mStud2.attendance());
		
		Student pStud=new PayStudent("Jessy");
		pStud.gpa=4.5f;
		
		PayStudent pStud2=new PayStudent("Ananth");
		System.out.println(pStud2.getscore());
		
		Student aStud=new AuditStudent("Sri");
		
		mStud.goToclass();
		pStud.goToclass();
		
		StudentList studList=new StudentList();
		
		studList.addStudent(mStud);
		studList.addStudent(pStud);
		studList.addStudent(aStud);
		
		ArrayList<Student> list=studList.getStudents();
		for(Student stud:list)
		{
			stud.goToclass();
			stud.goToClass("North");
			System.out.println(stud.college);
			System.out.println(stud.calculateCGP());
		}

	} 

}
