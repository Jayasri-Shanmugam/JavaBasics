package arraysamples;

import java.util.HashSet;

public class ReturnElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> list1=new HashSet<>();
		HashSet<String> list2=new HashSet<>();
		list1.add("Sri");
		list1.add("Suji");
		list1.add("Suba");
		
		list2.add("Sri");
		list2.add("Sandhiya");
		list2.add("Aishu");
		list2.add("Suji");
		
		System.out.println("First list "+list1);
		System.out.println("Second list "+list2);
		list1.retainAll(list2);
		System.out.println("Common elements "+list1);

	}

}
