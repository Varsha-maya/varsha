import java.util.Scanner;

class PayException extends Exception{
	private int bpay;
	PayException(int bpay){
		this.bpay=bpay;
	}
	public String toString() {
		return ("Pay not valid"+" "+bpay+"\n\n ||||Please Enter basic pay more than min range 10000||||");
	}
}

class Employee  {
	private int eno;
	private String ename;
	private int bpay;
	Employee(int eno,String ename,int bpay){
		this.eno=eno;
		this.ename=ename;
		this.bpay=bpay;
	}
	public void display() {
		try {
		System.out.println("Employee No:"+eno);
		System.out.println("Employee Name:"+ename);
		if(bpay<10000)throw new PayException(bpay);
		System.out.println("Basic Pay:"+bpay);
		}
		catch(PayException pay){
			System.out.println(pay);
		}
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in) ;
		Scanner s1=new Scanner (System.in) ;
        int a,b;
        String c;
        System.out.println("Enter the emp no");
        a=s.nextInt();
        System.out.println("Enter the name");
        c=s1.nextLine();
        System.out.println("Enter the Basic pay");
        b=s.nextInt();
		 Employee obj=new Employee(a,c,b);
		 obj.display();
		 //obj1.display();

	}

}
