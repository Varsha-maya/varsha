class Rectangle {
	
	int length;
    int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
        
    }
    void area() {
    	int ar=length*breadth;
    	System.out.println("Area of Rectangle is "+ar);
    }
    void perimeter() {
    	int per=2*(length+breadth);
    	System.out.println("Perimeter of Rectangle is "+per);
    }
	
}
public class Square extends Rectangle {
	static int side;
	Square(int s){
		super(s,s);
		
		this.side=s;
	
	
	int ar=s*s;
	System.out.println("Area of Square is "+ar);
}
	
	public static void main(String[] args) {
		Square s = new Square(3);
		Rectangle r=new Rectangle(3,4);
        r.area();
        r.perimeter();
        s.area();
        
	}

}
