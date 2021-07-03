//DAY 10 (QN 2)
import java.util.*;
class acc{
	 int accno;
	 int accbal;
	
	acc(int no,int bal){
		this.accno=no;
		this.accbal=bal;
		
		//display();
	}
	public String toString() {
		return("Account No "+accno+"     Balace amount "+accbal);
	}
}
public class account 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,acc> p = new TreeMap<Integer,acc>();
		
		p.put(1,new acc(105564754,500000));
		p.put(2,new acc(110463745,306445));
		p.put(3,new acc(124645770,700456));
		
		Set<Map.Entry<Integer,acc>> s=p.entrySet();
		for(Map.Entry<Integer,acc> r:s) {
			System.out.println(r.getKey()+"   "+r.getValue());}
			
		System.out.print("\n\n");
		for(Map.Entry<Integer, acc> entry:p.entrySet()){    
		        int key=entry.getKey();  
		        acc b=entry.getValue();  
		        if(b.accno==124645770) {  
		        System.out.println("Available balance in account  "+b.accno+" --------> Rs "+b.accbal+"  saved at key"+key);   
		        break;
		        }
		    }  
		
	
	}
}


