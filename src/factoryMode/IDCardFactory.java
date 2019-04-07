package factoryMode;

import java.util.HashMap;

public class IDCardFactory extends Factory {
	
	private HashMap database=new HashMap();
	private long number=100;

	@Override
	protected synchronized Product createProduct(String ownerString) {
		// TODO Auto-generated method stub
		return new IDCardProduct(ownerString,number++);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		IDCardProduct cardProduct=(IDCardProduct)product;
		database.put(cardProduct.getIDNumber(), cardProduct.GetOwner());
	}
	
	public HashMap getDatabase() {
		return database;
	}

}
