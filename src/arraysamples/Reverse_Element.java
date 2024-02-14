package arraysamples;

import java.util.ArrayList;

public class Reverse_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Ananth");
		l1.add("Jayasri");
		l1.add("Suji");
		l1.add("Sanjay");
		System.out.println("List 1 elements are "+l1);
		System.out.println("Reverse list elements are "+reverse(l1));
		}
		public static ArrayList<String> reverse(ArrayList<String> list) {
			ArrayList<String> lis1=new ArrayList<>();
			for(int i=list.size()-1;i>=0;i--) {
				lis1.add(list.get(i));
			}
			return lis1;
		}

	}


