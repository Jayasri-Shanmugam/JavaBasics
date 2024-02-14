package io_exception;

import java.io.File;
import java.util.Scanner;

public class ReadWritePermission 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		File file=new File("C:\\Workspace\\JavaBasics");
		Scanner input=new Scanner(System.in);
		System.out.println("Path of the file:");
		String path=input.nextLine();
		File file=new File(path);
		
		if(file.canRead())
		{
			System.out.println("This file is in read mode");
		}
		else
		{
			System.out.println("This file is not in read mode");
		}
		if(file.canWrite())
		{
			System.out.println("This file is in write mode");
		}
		else
		{
			System.out.println("This file is not in write mode");
		}
		input.close();

	}

}
