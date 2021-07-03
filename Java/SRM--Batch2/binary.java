//DAY 11(QN 1)
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import java.util.List;
 
public class binary {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(14);
        al.add(42);
        al.add(34);
        al.add(101);
        al.add(20);
 
       
        int index = Collections.binarySearch(al, 101);
        System.out.println("Element present at index: "+index);
 
        
       
        Collections.sort(al);
        
        // Get iterator
        Iterator lii = al.iterator();
        System.out.println("List sorted in Ascending: ");
        
        while(lii.hasNext()) {
           System.out.print(lii.next() + "   ");
        }
    }
}