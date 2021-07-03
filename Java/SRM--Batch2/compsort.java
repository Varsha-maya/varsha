//DAY 10 (QN NO:4)

import java.util.*;  
class Student {    
	   int rollno;    
	   String name;    
	  int age;    
	    Student(int rollno,String name,int age){    
	    this.rollno=rollno;    
	    this.name=name;    
	    this.age=age;    
	    }  
	  

	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  

	  
	    }    
  public class compsort{    
  public static void main(String args[]){    
  ArrayList<Student> al=new ArrayList<Student>();    
  al.add(new Student(101,"varsha",23));    
  al.add(new Student(106,"thaaru",27));    
  al.add(new Student(105,"ramya",21));   
//Sorting elements on the basis of name  
  Comparator<Student> cm1=Comparator.comparing(Student::getName);  
   Collections.sort(al,cm1);  
   System.out.println("Sorting by Name");  
   for(Student st: al){  
     System.out.println(st.rollno+"    "+st.name+"    "+st.age);  
     }  
   
  }    
  }    