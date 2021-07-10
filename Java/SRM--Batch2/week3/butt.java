import java.awt.*;       
import java.awt.event.*; 
import javax.swing.*;  

public class butt extends JFrame {
    private JTextField tfCount;
    
    private JButton btnCount;
    
    private int count = 0;

    public butt() {
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        
        tfCount = new JTextField(count + "",20);
        tfCount.setEditable(false);
        tfCount.setHorizontalAlignment(JTextField.CENTER);
        cp.add(tfCount);

        btnCount = new JButton("CLICK");
        cp.add(btnCount);
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                tfCount.setText(count + ""+"TIMES");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(200,200);
        setTitle("Click");
        setVisible(true);    
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new butt();
            }
        });
    }
}