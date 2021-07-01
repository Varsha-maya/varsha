//Day 8-- Qn 5

import java.util.*;
class Treeset {

	public static int sum(Integer[] value,int n) {
		if(n==0)
			return value[n];
		else 
			return value[n]+sum(value,n-1);
	}
    public static void main(String[] args)
    {
    	
        TreeSet<Integer> ts = new TreeSet<>();
        int sum1=0,sum2=0,sum3=0;
        // Elements are added using add() method
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);

        for (Integer val : ts)
    	{System.out.print(val+"  ");}
        // Iterating though the TreeSet
        System.out.println("\n\n***********TreeSet using For-loop *************");
        for (Integer value : ts)
        	{//System.out.println("Sum: "+value);
            sum1=sum1+value;}
        System.out.println("Sum: "+sum1);
        
        
        
        Iterator<Integer> iterate = ts.iterator();
        System.out.println("**********TreeSet using While-loop*************");
        // Accessing elements
        while(iterate.hasNext()) 
        	sum2=sum2+iterate.next();
            System.out.println("Sum: "+sum2);
            
            
         System.out.println("**********TreeSet using Recurrsion*************");
         Integer value[]=new Integer[ts.size()];
         ts.toArray(value);
          sum3=sum(value,value.length-1);
         System.out.println("Sum: "+sum3);
         
        
    }
}
