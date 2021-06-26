public class alion extends Thread {
    public void run()
    {
        System.out.println("varsha");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("thaaru");
    }
    public static void main(String[] args) throws InterruptedException
    {
    	alion c1 = new alion ();
    	alion  c2 = new alion ();
    	 
    	
    	c1.start();
    	 if(c1.isAlive()) {
          	System.out.println("Thread 1 is running");
          }
       
        c1.join();
       
       
       
        c2.start();
        if(c2.isAlive()) {
        	System.out.println("Thread 2 is running");
        }
        
        c2.join();
        
        System.out.println("completed");
       
        }
       
    }
