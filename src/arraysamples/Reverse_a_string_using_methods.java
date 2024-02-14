package arraysamples;

import java.util.Scanner;

public class Reverse_a_string_using_methods
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		String sentence=input.nextLine();
		
		Reverse(sentence);
		
		input.close();
		
	}

	public static void Reverse(String sentence)
	{
		// TODO Auto-generated method stub
		
		String[] words=sentence.split(" ");
		String reverse="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword+=word.charAt(j);
			}
			
			reverse+=reverseword+" ";
		}
		
		System.out.println(reverse);
		
	}

}
