package io_exception;

import java.io.File;
import java.util.Scanner;

public class FileSize 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//		File file=new File("C:\\Workspace\\JavaBasics");
		Scanner input=new Scanner(System.in);
		System.out.println("Path of the file:");
		String path=input.nextLine();
		File file=new File(path);
		
		if(file.exists())
		{
			double bytes=file.length();
			double kb=(bytes/1024);
			double mb=(kb/1024);
			System.out.println("File size in Bytes: "+bytes);
			System.out.println("File size in KB: "+kb);
			System.out.println("File size in MB: "+mb);
		}
		else
		{
			System.out.println("No File exists");
		}
		input.close();

	}

}
