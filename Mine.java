import mystuff.*;
import lab2.*;

public class Mine {
	
	public static void main (String [] args) {
	
	Lamp myLamp = new Lamp();	
	System.out.println("This is My lamp!");
	
	myLamp.setColor("white");
	myLamp.setWatts(45);
	myLamp.turnOn();
	String status = myLamp.showStatus();
	System.out.println(status);
	
	System.out.println("Lamp is "+myLamp.isOn()+
	" and is color " + myLamp.getColor() +
	" and is wattage " + myLamp.getWatts());
	
	Lamp yourLamp = new Lamp();	
	Yours.print();
	yourLamp.setWatts(60);
	yourLamp.setColor("blue");
	System.out.println(yourLamp.showStatus());
	
	Lamp otherLamp = new Lamp();	
	Others.print();
	
	StopWatch s=new StopWatch();
	s.start();
	s.stop();
	System.out.println ("Timer ran for "+ s.time()+ " seconds");
	}
		
}