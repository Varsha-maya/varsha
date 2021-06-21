public class oddeven_count {

  public static void main(String[] args) {

    	int n = 7689798;
	int even = 0,odd=0;
    
    while (n > 0)
    {
        int rem = n % 10;
        if (rem % 2 == 0)
            even++;
        else
            odd++;
        n = n / 10;
    }
        System.out.println("no of even digits: "+even);
	System.out.println("no of odd digits: "+odd);
	
  }
}