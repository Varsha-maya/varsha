
import java.util.*;
import java.io.*;


class prop
{
	public static void main(String [] args) throws Exception
	{
		Properties p = new Properties();
		
		p.put("Name: ", "varsha");
		p.put("Email: ", "var@dd.com");
		p.put("Phno", "9999888776");
		p.put("dob", "06/07");
		
		try
		{
			FileOutputStream f = new FileOutputStream("p.data");
			p.store(f,"Details");
		}
		catch(FileNotFoundException e)
		{}
		System.out.println("Stored");
		try
		{
			FileInputStream f1 = new FileInputStream("p.data");
			p.load(f1);
		}
		catch(FileNotFoundException e)
		{}
		
		Set s = p.keySet();
		for(Object n:s)
		{
			System.out.println(n +" "+ p.getProperty((String)n));
		}
	}
}