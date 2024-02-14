package io_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Craete an array of character
		
		char[] array=new char[100];
		
		//Craetes a reader using the file reader
		
		FileReader input=null;
		
		try
		{
			System.out.println("Current folder: "+System.getProperty("user.dir"));
			input=new FileReader("input.txt");
			input.read(array);
		}
		catch(FileNotFoundException exp)
		{
			exp.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				input.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Data in the file is: ");
		
		System.out.println(array);

	}

}
