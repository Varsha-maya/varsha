import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cir extends Frame implements ActionListener {
	Button b1,b2;
	Label l1,l3;
	TextField tf1,tf3;
	cir(){
		super("Are Of Circle");
		b1=new Button("GET VALUE");
		b2=new Button("CLEAR");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l1=new Label("Enter Radius");
		
		l3=new Label("Result");
		tf1=new TextField();
		
		tf3=new TextField();
		setLayout(new GridLayout(4,2));
		add(l1);add(tf1);;add(l3);add(tf3);add(b1);add(b2);
		
	}
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		String a="3.14";
		if(s.equals("GET VALUE")){
			float n1=Float.parseFloat(tf1.getText());
			float n2=Float.parseFloat(a);
			tf3.setText(Float.toString( (n1*n1*n2)));
			
		}
		else{
			tf1.setText("");tf3.setText("");
		}
	}
	

	public static void main(String[] args) {
		cir af=new cir();
		af.setSize(200,200);
		af.setVisible(true);

	}


}