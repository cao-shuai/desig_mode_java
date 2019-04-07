package PrototypeFramework;

public class MessageBox implements Product {
	private char decochar;
	
	public MessageBox(char decochar) {
		// TODO Auto-generated constructor stub
		this.decochar=decochar;
	}

	@Override
	public void use(String string) {
		// TODO Auto-generated method stub
		int length = string.getBytes().length;
		
		for (int i = 0; i < length+4; i++) {
			System.out.print(decochar);
		}
		System.out.println(" ");
		System.out.println(decochar+" "+string+" "+decochar);
		for (int i = 0; i < length+4; i++) {
			System.out.print(decochar);
		}
		System.out.println(" ");
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
