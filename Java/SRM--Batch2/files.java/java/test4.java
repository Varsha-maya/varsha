import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class test4 {
	public static void main(String arg[]) throws IOException {  
		
		File fsrc=new File("javaFile123.txt");         //File Descriptor for source file
	      File fdes=new File("javaFile1234.txt");        //File Descriptor for destination file
	      FileReader fr=new FileReader(fsrc);          //Creation of file reader object 
	      BufferedReader br=new BufferedReader(fr);  //Creation of buffer reader object
	      FileWriter fw= new FileWriter(fdes);      //Creation of file writer object 
	      String s=null;
	      while((s=br.readLine())!=null)             //Copying Content to the new file
	      {
	         fw.write(s);
	         fw.write("\n");
	         fw.flush();
	      }
	      System.out.println("copied succesfully");
	      System.out.println("\n******************content in copied file******************\n");
	      File fsrc1=new File("javaFile1234.txt");
	      FileReader fr1=new FileReader(fsrc1);          //Creation of file reader object 
	      BufferedReader br1=new BufferedReader(fr1);
	      int c=0;
	      while((c = br1.read()) != -1)         //Read char by Char
	      {
	            char character = (char) c;          //converting integer to char
	            System.out.print(character);
	      }
	}
	
}
