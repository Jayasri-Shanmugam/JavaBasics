package io_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		Properties connProp=new Properties();
		
		connProp.setProperty("username","Jayasri");
		connProp.setProperty("Password", "Jai@333");
		
		FileOutputStream propsFile=new FileOutputStream("Information.properties");
//		FileOutputStream propsFile1=new FileOutputStream("Information1.properties");

		connProp.store(propsFile, "Properties file");
//		connProp.store(propsFile, "Properties file");

		propsFile.close();
		
		
		String username=null;
		String password=null;
		
		Properties tempProp=new Properties();
		FileInputStream obtained=new FileInputStream("Information.properties");
//		FileInputStream obtained1=new FileInputStream("Information.properties");

		tempProp.load(obtained);
//		tempProp.load(obtained1);

		propsFile.close();
		
		username=tempProp.getProperty("username");
		password=tempProp.getProperty("Password");
		
		System.out.println(username+" "+password);

	}

}
