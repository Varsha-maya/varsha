interface gen<T>{
	void setvalue(T t);
	void getvalue();
}
 class gclass<T> implements gen<T>{
	private T t;
	 public void setvalue(T t) {
		this.t=t;
	}
	public void getvalue() {
		System.out.println("This is the generic interface with a value "+t);
		
	}
	 
 }
public class Intergen {

	public static void main(String[] args) {
		
		gclass<Integer> obj = new gclass<Integer>();
		obj.setvalue(6);
		obj.getvalue();
	}

}
