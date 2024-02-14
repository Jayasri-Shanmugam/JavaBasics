package arraysamples;

import java.util.HashMap;
import java.util.Scanner;

public class Mapkeyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(1,"Businss English");
		map1.put(2,"Python");
		map1.put(3,"DBMS");
		map1.put(4, "COA");
		map1.put(5,"TOC");
		System.out.println("Enter the key :");
		int key=sc.nextInt();
		int count=0;
        for(int a:map1.keySet()) {
        	if(a==key) {
        		System.out.println("value:"+map1.get(a));
        		count++;}
        }
        if(count==0)
        	System.out.println("No match found");
        sc.close();
	}

	}


