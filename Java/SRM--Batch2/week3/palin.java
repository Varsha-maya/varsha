import java.awt.*;
import java.awt.event.*;

class palin extends Frame implements ActionListener
{
	Label lstring1;
	TextField tfstring1, tfstring2;
	Button submit;
	TextArea display;

	palin()
	{
		lstring1 = new Label("Enter the value");
		

		tfstring1 = new TextField();
		

		submit = new Button("Get Result");

		display = new TextArea("", 2 , 100 , TextArea.SCROLLBARS_NONE);

		lstring1.setBounds(10, 40, 100, 20);
		tfstring1.setBounds(10, 65, 100, 20);

		
		

		submit.setBounds(10, 90, 210, 30);

		display.setBounds(10, 130, 210, 100);
		display.setEditable(false);
//itvoyagers.in
		add(lstring1);
		
		add(tfstring1);
		
		add(submit);
		add(display);

		submit.addActionListener(this);

		setTitle("Palindrome");
		setSize(230,240);
		setLayout(null);
		setVisible(true);

		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}
//itvoyagers.in
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==submit)
		{
			String str1 = tfstring1.getText();
			


			StringBuilder sb = new StringBuilder(str1);  
			sb.reverse();

			String oper =""+sb;
if(str1.equals(oper)){
			display.setText("Palindrome");
}else{
	display.setText("Not a Palindrome");
}
		}
	}
//itvoyagers.in
	public static void main(String[] args)
	{
		new palin();
	}
}