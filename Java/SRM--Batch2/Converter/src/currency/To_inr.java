package currency;

public class To_inr {
	public double eur;
	 public double dol;
	 public double yen;
	 public double inr;

public void eurtoinr(double inr) {
	 eur=inr/88.49;
	 System.out.println("Euro to INR :"+eur);
}
public void doltoinr(double inr) {
	 dol=inr/74.20;
	 System.out.println("Dol to INR :"+dol);
}
public void yentoinr(double inr) {
	  yen=inr/0.67;
	 System.out.println("yen to INR:"+yen);
}
}
