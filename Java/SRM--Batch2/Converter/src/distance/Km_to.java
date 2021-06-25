package distance;

public class Km_to {
	public double km;
	 public double m;
	 public double miles;
	 

public void kmtom(double km) {
	 m=km*1000;
	 System.out.println("Kilometer to Meter :"+m);
}
public void kmtomiles(double km) {
	 miles=km/1.609;
	 System.out.println("Kilometer to Miles :"+miles);
}
}
