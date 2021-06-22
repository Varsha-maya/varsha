public class ElectricityBill {
int cno;
String cname;
float Prev_read;
float Curr_read;
String type;

void setData(int Cno,String Cname,float prevread,float currread,char Type) {
	cno=Cno;
	cname=Cname;
	Prev_read=prevread;
	Curr_read=currread;
	if(Type=='d'||Type=='D')
	type="Domestic";
	else
	type="Commertial";
	
	double Bill=BillCalc(Prev_read,Curr_read,type);
	System.out.println("Your Bill Amount is Rs "+Bill);
}
double BillCalc(float pre,float curr,String typ) {
	double diff= curr-pre;
	double bill=0;
	if(typ=="Domestic") {
		if (diff<=100)
			bill=diff;
		if(diff<=200)
			bill=(diff-100)*2.5+100*1;
		if(diff<=500)
			bill=(diff-200)*4+100*2.5+100*1;
		else
			bill=(diff-500)*6+300*4+100*2.5+100*1;
		
			
	}
	if(typ=="Commertial") {
		if (diff<=100)
			bill=diff*2;
		if(diff<=200)
			bill=(diff-100)*4.5+100*2;
		if(diff<=500)
			bill=(diff-200)*6+100*4.5+100*2;
		else
			bill=(diff-500)*7+300*6+100*4.5+100*2;
	}
	return bill;
}


public static void main(String args[]){  
	  ElectricityBill s1=new ElectricityBill();  
	    
	  s1.setData(111,"varsha",400,900,'d');  
	   
	    
	 }  

}
