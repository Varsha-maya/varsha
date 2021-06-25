package currency;

public class Inr_to {
	public double eur;
	public double dol;
	public double yen;
	public double inr;
	public void eurtoinr(double eur) {
		 inr=eur*88.49;
		 System.out.println("Euro to INR:"+inr);
	}
	public void doltoinr(double dol) {
		  inr=dol*74.20;
		 System.out.println("Doll to INR:"+inr);
	}
	public void yentoinr(double yen) {
		 inr=yen*0.67;
		 System.out.println("Yen to INR:"+inr);
	}
}
