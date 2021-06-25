package time;

public class To_min {
	public double hr;
	 public double sec;
	 public double min;
	 

public void hrtomin(double hr) {
	 min=hr*60;
	 System.out.println("Hour to Minutes :"+min);
}
public void sectomin(double sec) {
	 min=sec/60;
	 System.out.println("Seconds to Minutes :"+min);
}
}
