//*********************************DAY 9 (QN NO :2)******************************

import java.util.*;
  
public class Listitt {
    public static void main(String[] argv) throws Exception
    {
        try {
  
           
            ArrayList<String>
                arrlist = new ArrayList<String>();  
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");
            System.out.println("ArrayList: "+ arrlist);
  
            
            ListIterator<String> lit = arrlist.listIterator();
            System.out.println("\n*****************Using ListIterator:**********\nValue is : ");
            while (lit.hasNext()) {
                System.out.print( lit.next()+"  ");
            }
            
            Iterator<String> itt = arrlist.iterator();
            System.out.println("\n\n********** using Iterator*************\n Value is : ");
                while(itt.hasNext()) {
                	System.out.print(itt.next()+"  ");
            }
        }
  
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}