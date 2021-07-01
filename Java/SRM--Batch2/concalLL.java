//Day8--Qn 3,4

import java.util.*;
public class concalLL{
 public static void main(String[] args) {
  
  LinkedList <String> c1 = new LinkedList <String> ();
  
          c1.add("varsha");
          c1.add("thaaru");
          c1.add("ramya");
         
          System.out.println("First linked list:       " + c1);
         LinkedList <String> c2 = new LinkedList <String> ();
          c2.add("keerthi");
          c2.add("Nagas");
          
          System.out.println("Second linked list:      " + c2);
        
     
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("\nNew linked list:         " + a);
        int f=-1;
        System.out.println("\nEnter the element you want to search");
        Scanner sc = new Scanner(System.in);    
        String name = sc.nextLine();
        //System.out.println(name);
        
        if(a.contains(name)==true)
        	System.out.println("Element present at index "+a.indexOf(name));
        else
        	System.out.println("Sorry , the given element is not present in the list");
        	
           

 }
}