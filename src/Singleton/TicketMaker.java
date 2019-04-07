package Singleton;

public class TicketMaker {

	private static int tickt=100;
	private static TicketMaker mInstance=null;
	
	private TicketMaker () {
		
	}
	
	public synchronized static TicketMaker getInstance() {
		if (mInstance == null) {
			mInstance=new TicketMaker();
		}
		return mInstance;
	}
	
	public synchronized int getNextTicketNumber() {
		return tickt++;
	}
}
