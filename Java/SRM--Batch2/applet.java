import java.applet.*;
import java.awt.*;
//import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

 class test6 extends Applet  {
	 
	public void paint(Graphics g){
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));  
	   g.drawString(dtf.format(now),100, 100);
	}	

}
