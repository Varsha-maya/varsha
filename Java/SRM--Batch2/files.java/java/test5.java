import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class test5 {
public static void main(String arg[]) throws IOException {  
		
		File fsrc=new File("javaFile123.txt");         
	      File fdes1=new File("javaFile12345.txt");  
	      FileReader fr=new FileReader(fsrc);           
	      BufferedReader br=new BufferedReader(fr);  
	      FileWriter fw1= new FileWriter(fdes1); 
	      //FileWriter fw2= new FileWriter(fdes2); 
	      String s=null;
	      while((s=br.readLine())!=null)             
	      {
	         fw1.write(s);
	         fw1.write("\n");
	         fw1.flush();
	      }
	      System.out.println("written in file1");
	      System.out.println("\n*********contents in file2*********\n");
	      File fsrc1=new File("javaFile12345.txt");
	      FileReader fr1=new FileReader(fsrc1);          //Creation of file reader object 
	      BufferedReader br1=new BufferedReader(fr1);
	      int c;
	      
	      while((c = br1.read()) != -1)         //Read char by Char
	      {
	            char character = (char) (c);       
	    	  if (Character.isLowerCase(character))
	    	   {
	    	        character=Character.toUpperCase(character);// convert assign variable
	    	   }
	            System.out.print(character);
	      }
	      File fsrc3=new File("javaFile123.txt");
	      File fdes3=new File("javaFile123456.txt");
	      FileReader fr3=new FileReader(fsrc3);           
	      BufferedReader br3=new BufferedReader(fr3);
	      FileWriter fw3= new FileWriter(fdes3);
	      String s1=null;
	      while((s1=br3.readLine())!=null)             
	      {	
	         fw3.write(s1);
	         fw3.write("\n");
	         fw3.flush();
	      }
	      System.out.println("\n\nwritten in file2");
	      System.out.println("\n*********contents in file2*********\n");
	      
	      File fsrc2=new File("javaFile123456.txt");
	      FileReader fr2=new FileReader(fsrc2);           
	      BufferedReader br2=new BufferedReader(fr2);
	      int c1;
	      
	      while((c1 = br2.read()) != -1)         
	      {
	            char character1 = (char) (c1);       
	    	  if (Character.isUpperCase(character1))
	    	   {
	    	        character1=Character.toLowerCase(character1);// convert assign variable
	    	   }
	            System.out.print(character1);
	      }

	      
}
}

