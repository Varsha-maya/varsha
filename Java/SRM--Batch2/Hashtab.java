//DAY 11(QN 4)
import java.util.*;

public class Hashtab {
	 public static void main(String args[]) {  
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
		     map.put(1,"varsha");    
		     map.put(2,"thaaru");   
		     map.put(3,"ramya");    
		     
		     
		     System.out.println("Before remove: "+ map);      
		       map.remove(2);  
		       System.out.println("After remove: "+ map);  
		       
		       map.putIfAbsent(4,"keerthi");  
		       System.out.println("Updated Map: "+map);  
		      
		       
		   }      

}