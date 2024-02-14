package arraysamples;

import java.util.ArrayList;

public class Copy_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(200);
		list1.add(100);
		System.out.println("List 1 elements are "+list1);
		ArrayList<Integer> list2=list1;
		System.out.println("List 2 elements are "+list2);

	}

}
