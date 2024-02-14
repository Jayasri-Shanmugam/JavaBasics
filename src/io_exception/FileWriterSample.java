package io_exception;

import java.io.FileWriter;

public class FileWriterSample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String data="This is Apple";
		
		try
		{
			//Create a file writer
			FileWriter output=new FileWriter("output.txt",true);
//			FileWriter output=new FileWriter("output.txt",true);
			//write string to file
			output.write(data);
			output.flush();
			//closes the writer
			output.close();
//			output1.write(data);
//			output1.flush();
//			output1.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
