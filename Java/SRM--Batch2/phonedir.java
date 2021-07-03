//DAY 10(QN NO: 1)

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class pho{
	 String name;
	 String phno;
	
	pho(String nme,String no){
		this.name=nme;
		this.phno=no;
	}
	public String toString() {
		return("Name: "+name+"     Phone no: "+phno);
	}
}
public class phonedir 
{
	public static void main(String[] args)
	{
		TreeMap<Integer,pho> p = new TreeMap<Integer,pho>();
		
		p.put(1,new pho("varsha","9648745143"));
		p.put(2,new pho("thaaru","8456064345"));
		p.put(3,new pho("ramya","7754970456"));
		
		Set<Map.Entry<Integer,pho>> s=p.entrySet();
		for(Map.Entry<Integer,pho> r:s) {
			
			System.out.println(r.getKey()+"   "+r.getValue());}
		
		System.out.print("\n\n");
			
			for(Map.Entry<Integer, pho> entry:p.entrySet()){    
		        int key=entry.getKey();  
		        pho b=entry.getValue();  
		        if(b.name=="thaaru") {  
		        System.out.println("Phone no of "+b.name+" --------> "+b.phno+"  saved at key"+key);   
		        break;
		        }
		    }    
		
	
	}
}



