package BasicPackage;

//import java.util.Scanner;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String type="Java Programming";
		String first="Java is object oriented programming";
		String second="Python";
		String third="Language";
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		//length
		System.out.println("Length of the string..."+first.length());
		//substring
		String sub=first.substring(10,16);
		System.out.println(sub);
		//concat
		String joinedString=first.concat(third);
		System.out.println("Joined String is..."+joinedString);
		//split
		String word[]=first.split("");
		for(int i=0;i<word.length;i++)
		{
			System.out.print(word[i]);
//			System.out.println();
		}
		System.out.println();
		String s1="Java";
		String s2="java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1==s2);
        String s3=new String("Jayasri");
        String s4=new String("jayasri");
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s3==s4);
        String uc=s1.toUpperCase();
        String lc=s2.toLowerCase();
        System.out.println(uc);
        System.out.println(lc);
//        String search=first.contains();
        String example="Hello";
        example=example.concat("Welcome");
        String newString = new String("Java program");
        String newStringOne=new String("Java program");
        if(newString==newStringOne)
        {
        	System.out.println("Both are equal");
        }
        else
        {
        	System.out.println("Both are not equal");
        }
	}

}
