package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketMaker ticketMaker=TicketMaker.getInstance();
		int number=0;
		for (int i = 0; i < 100; i++) {
			number=ticketMaker.getNextTicketNumber();
			System.out.println("ticket number is:"+number);
		}
		
		for (int i = 0; i < 100; i++) {
			Triple triple=Triple.getInstance(i%3);
			triple.getObjectNumber();
		}

	}

}
