package AbstractFactoryMoude;

import java.util.ArrayList;

public abstract class Tray extends Item {
	protected ArrayList tray=new ArrayList();
	
	public Tray(String catString){
		super(catString);
	}
	
	public void add (Item item){
		tray.add(item);
	}
}
