import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class tree {  
JFrame f;  
tree(){  
    f=new JFrame();   
    DefaultMutableTreeNode emp=new DefaultMutableTreeNode("Emp");  
    DefaultMutableTreeNode name=new DefaultMutableTreeNode("name");  
    emp.add(name);    
    DefaultMutableTreeNode n1=new DefaultMutableTreeNode("varsha");  
    DefaultMutableTreeNode n2=new DefaultMutableTreeNode("thaaru");  
    DefaultMutableTreeNode n3=new DefaultMutableTreeNode("chitra");  
    DefaultMutableTreeNode n4=new DefaultMutableTreeNode("keerthi");  
    name.add(n1); name.add(n2); name.add(n3); name.add(n4);      
    JTree jt=new JTree(emp);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new tree();  
}}  