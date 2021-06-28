class Stack<E>
{
E a[];
int top;
Stack()
{
a=(E[])new Object[100];
top=-1;
}
void push(E data)
{
a[++top]=data;
}
E pop()
{
return a[top--];
}
boolean hasElements()
{
return top!=-1;
}
 
}
class Check
{
public static void main(String arg[])
{
Stack<Integer> si=new Stack<Integer>();  
Stack<Double> sd=new Stack<Double>();  
si.push(10);
si.push(11);
si.push(12);
si.push(13);
sd.push(1.2); 

sd.push(6.8);

System.out.println("\nIntegers");
while(si.hasElements())
System.out.println(si.pop());
//si.pop(12);
 
System.out.println("\nDoubles");
while(sd.hasElements())
System.out.println(sd.pop());

}
}
