package arraysamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetSample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashSet<Integer> evenNumber=new HashSet<>();
		
		//using add method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		
		System.out.println("Hash Set: "+evenNumber);
		
		HashSet<Integer> numbers=new HashSet<>();
		
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New Hash Set: "+numbers);
		
		Iterator<Integer> iterate=numbers.iterator();
		System.out.print("Hash Set using Iterator ");
		
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		
		System.out.println();
		boolean value1=numbers.remove(5);
		System.out.println("Is 5 removed?: "+value1);
		
		boolean value2=numbers.removeAll(numbers);
		System.out.println("Is all element removed?: "+value2);
		
		HashSet<String> empList=new HashSet<>();
		
		empList.add("Karthick");
		empList.add("Jessie");
		empList.add("Sri");
		
		System.out.println("List of employees: "+empList);
		
		empList.add("Ananth");
		System.out.println("List of employees after adding ananth: "+empList);
		
		TreeSet<String> empList1=new TreeSet<>();
		
		empList1.add("Adhi");
		empList1.add("Tara");
		
		System.out.println("List of employees in tree hash set: "+empList1);

	}

}
