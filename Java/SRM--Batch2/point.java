package Training.com;
import java.lang.*;
public class point
{
    private int x;
    private int y;
    public point ( ) { }
    public point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY (int y)
    {
        this.y = y;
    }
    public void setXY (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX( )
    {
        return x;
    }
    public int gety ( )
    {
        return y;
    }
    public int addXY ( )
    {
        return (x + y);
    }
    public void display( )
    {
        System.out.println (x);
        System.out.println (y);
    }
    public double distance (point p2)
    {
        return(Math.sqrt( (x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y)));
    }
    public static void main (String args[ ])
    {
        double a, b, c;
        point p,p1,p2;
        p = new point(6, 6);
        p1 = new point();
        p2 = new point();
        p1.setX(6);
        p1.setY(6);
        p1.getX();
        p1.gety();
        p2.setXY(6,6);
        p2.addXY();
        a = p1.distance(p2);
        b = p2.distance(p);
        c = p.distance(p1);
        System.out.println("Distance between point p1 to p2 is " + a);
        System.out.println("Distance between point p2 to p is "  + b);
        System.out.println("Distance between point p to p1 is "  + c);
        System.out.println("Points of p, p1, p2");
        p.display();
        p1.display();
        p2.display();
    }
}
