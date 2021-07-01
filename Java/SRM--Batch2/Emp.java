//*****************DAY 9 (QN NO:3)**********************
import java.util.LinkedList;

class empinfo{
	 String eno;
	 String ename;
	 String edesgn;
	
	empinfo(String eno,String name,String desi){
		this.eno=eno;
		this.ename=name;
		this.edesgn=desi;
	}
	public String toString(){
		return("Employee no: "+eno+" "+"    Employee name: "+ename+" "+"     Designation: "+edesgn);
	}
	
}
public class Emp {

	public static void main(String[] args) {
		
		LinkedList<empinfo> obj=new LinkedList<empinfo>();
		obj.add(new empinfo("A7989","varsha","Trainee"));
		obj.add(new empinfo("A5979","thaaru","Manager"));
		obj.add(new empinfo("A4768","ramya","Tester"));
		
		for(empinfo val:obj){
			System.out.println(val);
		}
		

	}

}
