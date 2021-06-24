import java.util.Scanner;


class Mark extends Exception{
	private int mark;
	Mark(int mark){
		this.mark=mark;
	}
	public String toString() {
		return ("mark not valid"+" "+mark+"\n\n ||||Please Enter mark between 0 to 100||||");
	}
}

class Student  {
	private int rno;
	private String name;
	private int mark;
	Student(int rno,String name,int mark){
		this.rno=rno;
		this.name=name;
		this.mark=mark;
	}
	public void display() {
		try {
		System.out.println("Roll No:"+rno);
		System.out.println("Name:"+name);
		if(mark>100)throw new Mark(mark);
		if(mark<0)throw new Mark(mark);
		System.out.println("Mark:"+mark);
		}
		catch(Mark ma){
			System.out.println(ma);
		}
	}
	
	
}
public class SMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in) ;
		Scanner s1=new Scanner (System.in) ;
        int a,b;
        String c;
        System.out.println("Enter the roll no");
        a=s.nextInt();
        System.out.println("Enter the name");
        c=s1.nextLine();
        System.out.println("Enter the Marks obtained");
        b=s.nextInt();
		 Student obj=new Student(a,c,b);
		 /*Student obj1=new Student(112,"thaaru",111);
		 Student obj2=new Student(012,"ramya",0);
		 Student obj3=new Student(102,"arul",-32);*/
		 obj.display();
		 

	}

}
