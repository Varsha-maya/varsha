package validno;

import java.util.Scanner;

class Check{
String ch[];

Check(String inputs[]){
	this.ch=inputs;
}
public void validate() {
	int count=0,count1=0;
	for(int i=0;i<ch.length;i++) {
//	if(ch[i].matches("-?\\d+(\\.\\d+)?"))
//		count++;
		try {
			Double.parseDouble(ch[i]);
			count++;
		}catch (NumberFormatException e) {
			count1++;
		}
	
	}
	System.out.println("No of digits present in array is  "+count);
	
}
	
}
public class ValidMain {

	public static void main(String[] args) {
		System.out.println("Enter no values you want to enter in the array");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		Scanner s2=new Scanner(System.in);
//		String str[] = {"0","varsha","44","v","3"};
		String str[]=new String [a];
		System.out.println("Enter the values you want to enter in the array");
		for(int i=0;i<str.length;i++) {
			 str[i]=s2.nextLine();
		}
		System.out.print("The elements in the array are: { ");
		for (String element:str)
        {   
       System.out.print(element+"  ,  ");
        }
		Check obj=new Check(str);
		obj.validate();
	}

}
