package lab2;
public class Lamp {
	// obj attributes
	public boolean isOn=false;
	String color;
	int watts;
	
	//obj methods
	public String showStatus() {
		return "Light is " +isOn() + "\n"+
		" is color "+ color + "\n"+
		" and is " + watts + " watts";
	}
	
	public String isOn() {
		if (isOn) {
			return "ON";
		}else {
			return "OFF";
		}
	}
	
	public void turnOn() {
		isOn=true;
	}
	public void turnOff() {
		isOn=false;
	}
	public void setColor(String c) {
		color=c;
	}
	public String getColor() {
	return color;
	}
	public void setWatts(int w) {
		watts=w;
	}
	public int getWatts() {
	return watts;
	}
}