package factoryMode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product card1=factory.create("小明");
		Product card2=factory.create("小刚");
		Product card3=factory.create("小红");
		System.out.println("========================");
		card1.use();
		card2.use();
		card3.use();
	}

}
