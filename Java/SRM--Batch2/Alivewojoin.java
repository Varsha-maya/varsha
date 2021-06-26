public class joive extends Thread
{
	public void run()
	{
		System.out.println("r1 ");
		try {
        		Thread.sleep(500);
    		}
    	catch(InterruptedException ie) 
    	{ 
    		// do something
    	}
       	System.out.println("r2 ");
  	}
	public static void main(String[] args) throws InterruptedException
	{
		joive t1=new joive();
		joive t2=new joive();
		t1.start();
		
		System.out.println(t1.isAlive());
		
		//t1.join();
		t2.start();
		System.out.println(t2.isAlive());
		//t2.join();
		
	}
}
