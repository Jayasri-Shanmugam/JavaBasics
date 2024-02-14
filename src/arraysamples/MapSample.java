package arraysamples;

import java.util.HashMap;

public class MapSample
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> languages=new HashMap<>();
		
		languages.put(1,"Java");
		languages.put(2,"JavaScript");
		languages.put(3,"AngularJS");
		
		System.out.println("Hash map: "+languages);
		
		String value=languages.get(1);
		System.out.println();
		System.out.println("Value at key 1 is: "+value);
		
		System.out.println();
		System.out.println("Keys: "+languages.keySet());
		
		System.out.println();
		System.out.println("Values: "+languages.values());
		
		System.out.println();
		System.out.println("Returning both key value pair: "+languages.entrySet());
		
		System.out.println();
		String valueRem=languages.remove("Three");
		System.out.println("Removed value: "+valueRem);
		
		System.out.println();
		String valueRem1=languages.remove(1);
		System.out.println("Removed value: "+valueRem1);

	}

}
