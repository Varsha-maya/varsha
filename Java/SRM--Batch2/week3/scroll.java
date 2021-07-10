import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

class scroll extends JFrame implements AdjustmentListener
{
    JScrollBar black;
    JScrollBar green;
    JScrollBar blue;
    int cr=0;
    int cg=0;
    int cb=0;


    scroll()
    {
        super("SCROLLBAR");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        black=new JScrollBar(JScrollBar.HORIZONTAL);
        green=new JScrollBar(JScrollBar.HORIZONTAL);
        blue=new JScrollBar(JScrollBar.HORIZONTAL);
        add(black);
        add(green);
        add(blue);
        black.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);   
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {

        if(ae.getSource()==black)
            cr=ae.getValue();
        else if(ae.getSource()==green)
            cg=ae.getValue();
        else if(ae.getSource()==blue)
            cb=ae.getValue();
        System.out.println(cr + ":" + cg + ":" + cb);

       
        this.getContentPane().setBackground(new Color(cr,cg,cb)); 
    }


    public static void main(String args[])
    {
        scroll obj=new scroll();  
    }
}