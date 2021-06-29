import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test3 {
	public static void main(String arg[]) throws IOException {  
		 //String line=null;
		 
		 FileReader file1 =new FileReader("javaFile123.txt");
		 BufferedReader br=new BufferedReader(file1);
		 int c = 0,cc=0,wc=0;
		 int vowel=0,consonant=0,sym=0;
	      while((c = br.read()) != -1)         //Read char by Char
	      {
	            char character = (char) c;          //converting integer to char
	            System.out.print(character);
	            cc++;
	            if(character>='a'||character<='z'||character>='A'||character<='Z') {
	            if(character == 'a' || character == 'e' ||character == 'i' ||character == 'o' || character == 'u'||character == 'A' || character == 'E' ||character == 'I' ||character == 'O' || character == 'U')   //Checking for vowels
	               vowel++;
	            else if(character==' '||character=='.')
	            	sym++;
	            }
	            if(character==' '||character=='.')
	            	wc++;
	           
	      }

	      System.out.println();
	      System.out.println("Characters:  "+cc);
		 System.out.println("Vowels:  "+vowel);
		 System.out.println("Consonants: "+(cc-sym-vowel));
		 System.out.println("Words: "+(wc+1));
		 
}
}
