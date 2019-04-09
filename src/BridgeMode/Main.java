package BridgeMode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display(new StringDisplay("Hello,China"));
		Display d2=new Display(new StringDisplay("Hello,world"));
		CountDisplay d3= new CountDisplay(new StringDisplay("Hello,caoshuai"));
		d1.display();
		d2.display();
		d3.multDisplay(3);
	}

}
