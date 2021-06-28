import java.util.*;
  
public class Que {
  
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
  
        pq.add("varsha");
        pq.add("thaaru");
        pq.add("ramya");
        System.out.println("Intially Queue is....");
        System.out.println(pq+"\n");
        pq.remove("thaaru");
        
        System.out.println("After Remove .....");
        System.out.println(pq+"\n");
        
        pq.add("thaaru");
        System.out.println("After add .....");
        System.out.println(pq+"\n");
        
        
    }
}
