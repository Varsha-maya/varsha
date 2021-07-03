//DAY 10 (QN NO: 3)

import java.util.*;
class emp{
	int eno;
	String ename;
	String edesgn;
	emp(int no,String name,String desgn){
		this.eno=no;
		this.ename=name;
		this.edesgn=desgn;
		
	}
	public String toString() {
		return("Employee no: "+eno+"     Employee name: "+ename+"      Employee Designation: "+edesgn);
	}
}
public class emptree {
	public static void main(String[] args)
	{
		TreeMap<Integer,emp> p = new TreeMap<Integer,emp>();
		p.put(1, new emp(12,"varsha","developer"));
		p.put(2, new emp(68,"thaaru","programmer"));
		p.put(3, new emp(56,"ramya","trainee"));
		p.put(4, new emp(78,"keerthi","tester"));
		p.put(5, new emp(55,"nisha","manager"));
		
		
		Set<Map.Entry<Integer,emp>> s=p.entrySet();
		for(Map.Entry<Integer,emp> r:s) {
			System.out.println(r.getKey()+"   "+r.getValue());
		
		}

		
		
	}
}
