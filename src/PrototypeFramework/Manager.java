package PrototypeFramework;

import java.util.HashMap;

public class Manager {
	private HashMap showcaseHashMap  = new HashMap();
	
	public void register(String name,Product prototype){
		showcaseHashMap.put(name, prototype);
	}
	
	public Product create(String prototypename) {
		Product product=(Product)showcaseHashMap.get(prototypename);
		return product.createProduct();
	}

}
