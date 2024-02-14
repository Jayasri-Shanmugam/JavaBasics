package arraysamples;

import java.util.ArrayList;

public class ArrayListSamples 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> languages=new ArrayList<>();
		
		System.out.println();
		System.out.println("Initial size of the arraylist:"+languages.size());
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		System.out.println();
		System.out.println("ArrayList: "+languages);
		System.out.println("Size of the arraylist: "+languages.size());
		System.out.println("Get element: "+languages.get(1));
		
		languages.set(2,"JavaScript");
		languages.remove(1);
		
		System.out.println("Updated ArrayList: "+languages);

	}

}
