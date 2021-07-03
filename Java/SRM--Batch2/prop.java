import java.util.*;  
import java.io.*;  
public class prop {

	 
	public static void main(String[] args) throws IOException{  
	  
		Properties p=new Properties();  
		p.put("A7879","varsha");  
		p.put("A9899","thaaru");  
		try{
			FileOutputStream obj=new FileOutputStream("p.dat");
			p.store(obj,"Details");
		}catch(FileNotFoundException e){}
		  
		System.out.println("Stored Successfully");  
		  
		}  
		}  
