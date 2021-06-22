public class Room {
int roomno;
String roomtype;
int roomarea;
String ACmachine;

void setData(int rno, String rtype,int rarea,String AC){  
	  roomno=rno;
	  roomtype=rtype;
	  roomarea=rarea;
	  ACmachine=AC;
	 }  
	 void displayData(){
		 System.out.println("roomno ------> "+roomno);
		 System.out.println("roomtype ------> "+roomtype);
		 System.out.println("roomarea ------> "+roomarea+" sqrf");
		 System.out.println("ACmachine ------> "+ACmachine);
		 }  
  
  public static void main(String args[]){  
		  Room s1=new Room();  
		  Room s2=new Room();  
		  s1.setData(111,"1BHK",450,"Available");  
		  s2.setData(222,"3BHK",950,"Not Available");  
		  s1.displayData();  
		  s2.displayData();  
		 }  
	}  
