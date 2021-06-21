public class Amstrong {

  public static void main(String[] args) {

    	int n = 371, n1, remainder, result = 0;

        n1=n;

        while (n1 != 0)
        {
            remainder = n1 % 10;
            result += Math.pow(remainder, 3);
            n1 /= 10;
        }

        if(result == n)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
  

	
  }
}