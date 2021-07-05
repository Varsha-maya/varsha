import java.util.ArrayList;

public class everem {
	public static void main(String args[]){  
	     ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("varsha");  
	     alist.add("thaaru");  
	     alist.add("ramya");  
	     System.out.println("Original Array List");
	     System.out.println(alist);
	     alist.removeIf(n->(n.length()%2==0));
	     System.out.println("\nArray List after removal of even length");
	     System.out.println(alist);
	}
}
