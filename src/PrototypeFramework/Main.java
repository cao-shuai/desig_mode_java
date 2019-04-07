package PrototypeFramework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//praper
		Manager manager=new Manager();
		UnderlinePen underlinePen=new UnderlinePen('~');
		
		MessageBox mBox=new MessageBox('*');
		MessageBox sBox=new MessageBox('/');
		
		manager.register("strong message", underlinePen);
		manager.register("warning box", mBox);
		manager.register("slah box", sBox);
		
		//create
		Product product1=manager.create("strong message");
		product1.use("Hello,world.");
		
		Product product2=manager.create("warning box");
		product2.use("Hello,world.");
		
		Product product3=manager.create("slah box");
		product3.use("Hello,world");
	}

}
