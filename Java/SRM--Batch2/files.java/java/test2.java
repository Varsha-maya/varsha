import java.io.*;  
import java.io.FileWriter;
import java.io.FileReader;
import java.util.*;  
class copyfile {  
 public static void main(String arg[]) throws IOException {  
	 
	 FileWriter file = new FileWriter("javaFile123.txt");
	 file.write("Hi Iam Varsha N from SRM Technologies , My employee id is A79879.");
	 System.out.println("Successfully written");
	 String line=null;
	 
	 FileReader f1 =new FileReader("javaFile123.txt");
	 BufferedReader br=new BufferedReader(f1);
	 while((line=br.readLine())!=null) {
		 System.out.println(line);
	 }
	 
	 
 }  
}   
