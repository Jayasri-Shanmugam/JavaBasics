package io_exception;

import java.io.File;
import java.util.Scanner;

public class SpecificFile
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
//		File file=new File("C:\\Workspace\\JavaBasics");
//		File[] list=file.listFiles();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Path of the file:");
		String path=input.nextLine();
		File file=new File(path);
		File[] list=file.listFiles();
		System.out.println("Extension of the file to be searched:");
		String extension=input.nextLine();
		
		int filecount=0;
		
		for(int i=0;i<list.length;i++)
		{
			String fil=list[i].getName();
			if(fil.contains(extension))
			{
				System.out.println("Result:");
				System.out.println(fil);
				filecount++;
			}
		}
		if(filecount==0)
		{
			System.out.println("No match found");
		}
		input.close();
		
	}

}
