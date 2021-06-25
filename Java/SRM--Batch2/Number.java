public class Number {
private double num;

 boolean iszero(double no) {
	if(no==0)
		return true;
	else
		return false;
}
boolean ispositive(double no) {
	if(no>0)
		return true;
	else
		return false;
}
boolean isnegative(double no) {
	if(no<0)
		return true;
	else
		return false;
}
boolean isodd(double no) {
	if(no%2!=0)
		return true;
	else
		return false;
}
boolean iseven(double no) {
	if(no%2==0)
		return true;
	else
		return false;
}
boolean isprime(double no) {
	double flg=0;
	if(no%1==0) {
    for (int i = 2; i <= no / 2; ++i) {
      if (no % i == 0) {
        flg++;
        break;
      }
    }
	if(flg==0)
		return true;
	else
		return false;
	}
	else 
		return false;
}
boolean isAmstrong(double no) {
	
	double n1, remainder, result = 0;

    n1=no;

    while (n1 != 0)
    {
        remainder = n1 % 10;
        result += Math.pow(remainder, 3);
        n1 /= 10;
    }

    if(result == no)
        return true;
    else
         return false;
	
}
double getfac(double no) {
	int intPart = (int) no;
	double decimalpart=no- intPart;// 5.5
	double fact=1;
	for(double i=1+decimalpart;i<=no;i++){    
	      fact=fact*i;    
	  }  
	return fact;
}

double getsqr(double no) {
	return no*no;
}

double getsqrt(double no) {
	return Math.sqrt(no);
}

double getsum(double no) {
	double sum1,sum2,sum;//24.56 
	int intPart = (int) no;
	double decimalpart=no- intPart;
//System.out.println(decimalpart);
    for(sum1=0; intPart!=0; intPart=intPart/10)  
	{  sum1 = sum1 + intPart % 10;  }
    for(sum2=0; decimalpart!=0; decimalpart=decimalpart/10)  
	{  sum2 = sum2 + decimalpart % 10;  }
    sum=sum1+sum2;
    return sum;
}

double getrev(double no) {
	
	String before=Double.toString(no);
	char ch[]=before.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    double reversedDouble=Double.parseDouble(rev);
    return reversedDouble;
   
}

void disp_fac(double no) {
	System.out.println("factors of "+num+" is  ");
	for (int i=1;i<=num;i++)
        if (num%i==0)
            System.out.print(i+" ");
	System.out.println();
}
void disp_binary(double no) {
	System.out.println(System.out.println("ByteValue of lg :" + Long.toBinaryString(num));
}
public void getdata()
{
	Scanner s=new Scanner(System.in);
	double AA=s.nextDouble();
	num=AA;
	boolean a,b,c,d,e,f,g;
	  double h,i,j,k,l;
	  a=iszero(num);
	  b=ispositive(num);
	  c=isnegative(num);
	  d=isodd(num);
	  e=iseven(num);
	  f=isprime(num);
	  g=isAmstrong(num);
	  h=getfac(num);
	  i=getsqr(num);
	  j=getsqrt(num);
	  k=getsum(num);
	  l=getrev(num);
	  displaydata(a,b,c,d,e,f,g,h,i,j,k,l);
	  
	  
}
void displaydata(boolean a,boolean b,boolean c,boolean d,boolean e,boolean f,boolean g,double h,double i,double j,double k,double l) {
	if (a==true)
		System.out.println("The number is zero");
	else
		System.out.println("The number is not zero");
	if (b==true)
		System.out.println("The number is positive");
	else
		System.out.println("The number is not positive");
	if (c==true)
		System.out.println("The number is negative");
	else
		System.out.println("The number is not negative");
	if (d==true)
		System.out.println("The number is odd");
	else
		System.out.println("The number is not odd");
	if (e==true)
		System.out.println("The number is even");
	else
		System.out.println("The number is not even");
	if (f==true)
		System.out.println("The number is prime");
	else
		System.out.println("The number is not prime");
	if (g==true)
		System.out.println("The number is a Amstrong no");
	else
		System.out.println("The number is a not Amstrong no");
	System.out.println("Factorial of "+num+" is  "+h);
	System.out.print("Square of "+num+" is " +num);
	System.out.format("%.2f",i);
	System.out.println();
	System.out.println("Squareroot of "+num+" is  "+j);
	System.out.println("Sum of digits of "+num+" is  "+k);
	System.out.println("Reverse of "+num+" is  "+l);
	disp_fac(num);
	disp_binary(num);
	
	
	
}
public static void main(String args[]){  
	  Number s1=new Number(); 
	  System.out.println("Enter the no");
	   s1.getdata();  
	    
	 }  
}
