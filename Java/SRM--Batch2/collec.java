// DAY 10(QN NO:5)

import java.util.*;
public class collec {

   public static void main(String args[]) {
      
      
      LinkedList<Integer> ll = new LinkedList<Integer>();
      ll.add((1));
      ll.add((2));
      ll.add((3));
      ll.add((4));
      ll.add((5));
      
      // Create a reverse order comparator
      Comparator r = Collections.reverseOrder();
      
      // Sort list by using the comparator
      Collections.sort(ll, r);
      Iterator li = ll.iterator();
      System.out.println("List sorted in Descending: ");
      
      while(li.hasNext()) {
         System.out.print(li.next() + "   ");
      }
      System.out.println();
      System.out.println();
      Collections.sort(ll);
      
      // Get iterator
      Iterator lii = ll.iterator();
      System.out.println("List sorted in Ascending: ");
      
      while(lii.hasNext()) {
         System.out.print(lii.next() + "   ");
      }
      System.out.println();
      System.out.println();
      
      Collections.shuffle(ll);
      
      // display randomized list
      li = ll.iterator();
      System.out.println("List shuffled: ");
      
      while(li.hasNext()) {
         System.out.print(li.next() + "   ");
      }

      System.out.println();
      System.out.println();
      System.out.println("Minimum: " + Collections.min(ll));
      System.out.println("Maximum: " + Collections.max(ll));
   }
}
