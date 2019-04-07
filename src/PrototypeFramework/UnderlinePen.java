package PrototypeFramework;

public class UnderlinePen implements Product {
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		// TODO Auto-generated constructor stub
		this.ulchar=ulchar;
	}

	@Override
	public void use(String string) {
		// TODO Auto-generated method stub
		int length=string.getBytes().length;
		System.out.println("\" "+string+"\"");
		System.out.print("");
		for (int i = 0; i < length+4; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");

	}

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		Product product=null;
		try {
			product=(Product)clone();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return product;
	}

}
