import java.io.*;  
public class test1 {  
    public static void main(String[] args) {  
    	String path = "";  
        boolean bool = false;  
        try {  
            File file = new File("javaFile123.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists."); 
                
            }  
            
            System.out.println(file);  
             
            File file2 = file.getCanonicalFile();  
            
            System.out.println(file2);  
            bool = file2.exists();  
              
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
            
            System.out.println(file.getName()+" \nCan Write: "+file.canWrite()+" \nCan Read: "+file.canRead()+"\nLength: "+file.length()+" bytes"+"\nType:"+file.isFile());  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        
  
    }  
}