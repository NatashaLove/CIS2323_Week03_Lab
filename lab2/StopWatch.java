package lab2;
public class StopWatch {
	private long startTime;
	private long stopTime;
	
	public void start() {
		startTime=System.nanoTime();
	}
	public void stop() {
		stopTime=System.nanoTime();
	}
	public double time() {
		return ((stopTime-startTime)/ 1000000.0);
	}
}