public class Prime_sumofdigit {

  public static void main(String[] args) {

    int num = 29;
    int temp = 0,flag =0;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag++;
        break;
      }
    }

    if (flag==0)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");

     int sum;

     for(sum=0; num!=0; num=num/10)  
	{  sum = sum + num % 10;  } 
  
     System.out.println("Sum of digits: "+sum);  
  

  }
}
