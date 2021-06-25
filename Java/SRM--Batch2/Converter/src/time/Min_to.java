package time;

public class Min_to {
	public double hr;
	 public double sec;
	 public double min;
	 

public void mintohr(double min) {
	hr=min/60;
	 System.out.println(" Minutes to Hour :"+hr);
}
public void mintosec(double min) {
	 sec=min*60;
	 System.out.println("Minutes to Seconds :"+sec);
}
}
