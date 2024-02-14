package io_exception;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.util.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class ReadLine 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		String filepath="C:\\Workspace\\JavaBasics\\output.txt";
		Scanner input=new Scanner(System.in);
		System.out.println("Path of the file:");
		String path=input.nextLine();
		File filepath=new File(path);
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) 
		{
            String line="";

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        } 
		catch (IOException e)
		{
            e.printStackTrace();
        }
		input.close();

	}

}
