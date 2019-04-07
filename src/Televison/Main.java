package Televison;

import factoryMode.Factory;
import factoryMode.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory tvFactory = new TelevsionFactory();
		Product tvcard1=tvFactory.create("图腾");
		Product tvcard2=tvFactory.create("熊猫");
		Product tvcard3=tvFactory.create("海信");
		tvcard1.use();
		tvcard2.use();
		tvcard3.use();
	}

}
