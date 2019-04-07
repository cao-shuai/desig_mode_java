package AbstractFactoryMoude;

public abstract class Item {
	protected String captionString;
	public Item(String captionString){
		this.captionString=captionString;
	}
	public abstract String makeHTML();
}
