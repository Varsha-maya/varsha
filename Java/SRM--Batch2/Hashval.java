// ************************************DAY 9 (QN NO:4)*****************
import java.util.Iterator;
import java.util.*;

 
class Hashval
{
    // Program to print all values in a map using `values()` in Java
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "VARSHA");
        map.put(2, "THAARU");
        map.put(3, "RAMYA");
 
       System.out.println(map);
       System.out.println("\n************Values seperately**********");
        Iterator<String> itr = map.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            //System.out.println(Collections.(map.keySet()));
        }
        System.out.println("\n************Keys seperately**********");
        Set<Integer> kkkk = map.keySet();
        for(Integer key:kkkk)
        	System.out.println(key);
 
       
    }
}