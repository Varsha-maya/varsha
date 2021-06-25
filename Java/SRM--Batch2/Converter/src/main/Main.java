package main;
import currency.*;
import distance.*;
import time.*;
public class Main {
	public static void main(String[] args) {
		To_inr obj=new To_inr ();
		obj.eurtoinr(1);
		obj.doltoinr(1);
		obj.yentoinr(1);
		
		Inr_to obj1=new  Inr_to();
		obj1.eurtoinr(1);
		obj1.doltoinr(1);
		obj1.yentoinr(1);
		
        Km_to ref=new  Km_to();
        ref.kmtom(20);
        ref.kmtomiles(20);
        
        To_km ref1=new To_km();
        ref1.mtokm(5000);
        ref1.milestokm(30);
        
        To_min tim=new To_min();
        tim.hrtomin(6);
        tim.sectomin(120);
        
        Min_to tim1=new Min_to();
        tim1.mintohr(180);
        tim1.mintosec(3);
        
        	
	}
}
