import java.util.ArrayList;
public class minfro {
 public void minFro(ArrayList<Integer> arr) {
    int ind = 0;
    
    for (int i = 1; i < arr.size(); i++) {
        if (arr.get(ind) > arr.get(i)) {
            ind = i;
        }
    }
    
    int minValue = arr.remove(ind);
    arr.add(0, minValue);
    
    for (int i = 1; i < arr.size(); i++) {
    	System.out.println("New array"+arr.get(i));
    }
}


	public void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(8);
		a.add(92);
		a.add(4);
		a.add(2);
		a.add(17);
		a.add(9);
		System.out.println(a);
		minFro(a);
		}
}




