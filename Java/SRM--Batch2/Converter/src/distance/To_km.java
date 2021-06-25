package distance;

public class To_km {
	public double km;
	 public double m;
	 public double miles;
	 

public void mtokm(double km) {
	 m=km/1000;
	 System.out.println(" Meter to Kilometer :"+m);
}
public void milestokm(double km) {
	 miles=km*1.609;
	 System.out.println(" Miles to Kilometer :"+miles);
}
}
