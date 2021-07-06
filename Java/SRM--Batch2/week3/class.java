public class Classclass {

	public static void main(String[] args) throws ClassNotFoundException{
		Class c=Class.forName("java.lang.String");
		Class c1=Class.forName("java.lang.Integer");
		String a="varsha";
		int d=6;
		
		boolean b=c.isInstance(a);
		System.out.println(b);
		
		boolean b1=c.isInstance(d);
		System.out.println(b);
		
		boolean b2=c1.isInstance(d);
		System.out.println(b1);
		
		Class ab=Class.forName("java.lang.String");
		Class ba=Class.forName("java.lang.Runnable");
		
		boolean b4=ab.isInterface();
		System.out.println(b4);
		
		boolean b5=ba.isInterface();
		System.out.println(b5);
		
		

	}

}
