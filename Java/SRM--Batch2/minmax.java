//****************************DAY 9 (QN NO:5)***************************************

import java.util.*;
import java.util.Map.Entry;

public class minmax {
	public static void main(String[] args)
    {
       
        HashMap<Integer, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put(1, 3870);
        map.put(2, 6830);
        map.put(3, 1620);

       
        System.out.println(map);
     
        
        int minValue=(Collections.min(map.values()));
        int maxKey=(Collections.max(map.keySet()));
        
        System.out.println("\n\nSmallest  value in the Map------->"+minValue);
        System.out.println("\nLargest  Key in the Map--------->"+maxKey);
        
    }

}