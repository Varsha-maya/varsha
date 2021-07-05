import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

public class hashtree {
 
 public static void main(String[] args) {
 
    String str;
 
    
    Hashtable<String, String> hashtable = new Hashtable<String, String>();
    hashtable.put("1", "Varsha");
    hashtable.put("2", "thaaru");
    hashtable.put("3", "ramya");
    hashtable.put("4", "keerthi");
    hashtable.put("5", "anu");
 
    System.out.println("Hashtable contains:");
  Set<String> keys = hashtable.keySet();
 
    
    Iterator<String> itr = keys.iterator();
 
    
    while (itr.hasNext()) { 

       str = itr.next();
      
       System.out.println(str+"----->"+hashtable.get(str));
    } 
 }
}
