package io_exception;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.DateFormat;

public class DateModified 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//		File filepath=new File("C:\\Workspace\\JavaBasics");
		Scanner input=new Scanner(System.in);
		System.out.println("Path of the file:");
		String path=input.nextLine();
		File filepath=new File(path);
		
	    if(filepath.exists())
	    {
	    	System.out.println("Last modified date in milliseconds:");
	    	long time=filepath.lastModified();
	    	System.out.println(time);
	    	DateFormat date=new SimpleDateFormat("dd-MM-yyyy");
	    	System.out.println("Last Modified date:");
	    	System.out.println(date.format(time));
	    }
	    else
	    {
	    	System.out.println("No file exists");
	    }
	    input.close();

	}

}
