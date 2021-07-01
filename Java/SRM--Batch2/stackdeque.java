//********************DAY 9 (QN NO 1)***********************

	import java.util.ArrayDeque;
	import java.util.Deque;
//	class Deque<E>
//	{
//	E a[];
//	int top;
//	Deque()
//	{
//	a=(E[])new Object[100];
//	top=-1;
//	}
//	void push(E data)
//	{
//	a[++top]=data;
//	}
//	E pop()
//	{
//	return a[top--];
//	}
//	boolean hasElements()
//	{
//	return top!=-1;
//	}
import java.util.Deque;

	public  class stackdeque {

		public static void main(String[] args) {
			Deque<String> obj = new ArrayDeque<String>();
			
			  obj.push("aaa");
		      obj.push("bbb");
		      obj.push("ccc");
		      obj.push("ddd");
		      obj.push("eee");
		      System.out.println(obj);
//		      while(obj.hasElements())
//		    	  System.out.println(obj.pop());
		      obj.pop();
		      
		      System.out.println("\nAfer pop operation (LIFO)----->"+obj);
		 
		}

	}
	

