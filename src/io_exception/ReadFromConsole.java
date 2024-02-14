package io_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole
{

//	public static void main(String[] args) throws ApplicationException
//	{
//		// TODO Auto-generated method stub
//		doReadFromStdin();
//	}
		
		private static void process(String str)
		{
			System.out.println("Processing-----> "+str+"\n");
		}
		
		private static void doReadFromStdin() throws ApplicationException
		{
			BufferedReader inStream=new BufferedReader(new InputStreamReader(System.in));
			String inLine="";
			
			while(!(inLine.equalsIgnoreCase("quit"))&&!(inLine.equalsIgnoreCase("exit")))
			{
				System.out.print("prompt>");
				try
				{
					inLine=inStream.readLine();
				}
				catch(IOException e)
				{
					throw new ApplicationException(e.toString(),e);
				}
				process(inLine);
			}
				
		}
		public static void main(String[] args) throws ApplicationException
		{
			// TODO Auto-generated method stub
			doReadFromStdin();
		}

	}


