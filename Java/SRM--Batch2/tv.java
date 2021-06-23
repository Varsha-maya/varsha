interface SmartTvRemote
{

 public void ONOFF();

}

class TvOFF implements SmartTvRemote
{

 @Override
 public void ONOFF()
 {
 System.out.println("Smart TV is Switched OFf");
 }

}

class TvON implements SmartTvRemote
{

 @Override
 public void ONOFF()
 {
 System.out.println("Smart TV is Switched On");
 }

}

class SmartTv implements SmartTvRemote
{

 private SmartTvRemote smartTvState;

 public SmartTvRemote getSmartTvState()
 {
 return smartTvState;
 }

 public void setSmartTvState(SmartTvRemote smartTvState)
 {
 this.smartTvState = smartTvState;

 }

 @Override
 public void ONOFF()
 {
 System.out.println("Current state Of Smart Tv : " + 
 smartTvState.getClass().getName());
 smartTvState.ONOFF();

 }

}



public class Tv {
	 public static void main( String[] args )
	 {
	 SmartTv smartTv= new SmartTv();
	 SmartTvRemote smartTvSwitchOnState = new TvON();
	 SmartTvRemote smartTvSwitchOffState = new TvOFF ();

	 smartTv.setSmartTvState(smartTvSwitchOnState);
	 smartTv.ONOFF();

	 smartTv.setSmartTvState(smartTvSwitchOffState);
	 smartTv.ONOFF();
	 }
}
