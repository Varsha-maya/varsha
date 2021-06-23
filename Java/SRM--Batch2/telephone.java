abstract class Telephone {
	abstract void lift();
    abstract void disconnected();
}
class SmartTelephones extends Telephone{
    void lift(){
        System.out.println("Lift");}
    void disconnected(){
        System.out.println("Disconnected");
    }
    }
public class telem {
	public static void main(String[] args) {
		SmartTelephones t = new SmartTelephones();
        t.lift();
        t.disconnected();
    }

}
