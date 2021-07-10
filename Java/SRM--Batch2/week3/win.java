
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;

import javax.swing.JFrame;  
public class win extends Frame{  
    win(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        //setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
    }  
public static void main(String[] args) {  
    new win();  
} 
}
