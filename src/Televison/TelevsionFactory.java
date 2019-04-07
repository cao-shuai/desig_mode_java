package Televison;

import java.util.ArrayList;
import java.util.List;

import factoryMode.Factory;
import factoryMode.Product;

public class TelevsionFactory extends Factory {
	
	private List televisonProduct= new ArrayList(); 
	
	@Override
	protected Product createProduct(String ownerString) {
		// TODO Auto-generated method stub
		return new TelevisonProdcut(ownerString);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		televisonProduct.add(((TelevisonProdcut)product).GetProductname());
	}

}
