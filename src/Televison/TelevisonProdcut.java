package Televison;

import factoryMode.Product;

public class TelevisonProdcut extends Product {

	private String productname;
	TelevisonProdcut(String name){
		System.out.println("制作"+name+"电视");
		productname=name;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("使用"+productname+"电视");

	}
	
	public String GetProductname() {
		return productname;
	}

}
