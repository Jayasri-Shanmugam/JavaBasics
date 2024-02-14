package io_exception;

import java.io.File;
import java.io.IOException;

public class FileCreateSample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		File dir=new File("C:\\Workspace\\JavaBasics");
		File files[]=dir.listFiles();
		for(int i=0;i<files.length;i++)
		{
			System.out.println(files[i].getName());
		}
		
		boolean value=false;
		
		//trying to create a file based on object
		
		boolean isDir=dir.isDirectory();
		dir.getAbsolutePath();
		dir.exists();
		
		if(isDir)
		{
			File file=new File("NewFile1");
			try
			{
				value=dir.createNewFile();
				File.createTempFile("myText","txt",dir);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(value)
		{
			System.out.println("The new file is created");
		}
		else
		{
			System.out.println("The file already exists");
		}
		
	}

}
