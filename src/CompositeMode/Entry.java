package CompositeMode;

public abstract class Entry {
	protected Entry parent;
	public abstract String getName();
	public abstract long getsize();
	
	public Entry add(Entry entry) throws FileTreatementException{
		throw new FileTreatementException();
	}
	public void printList(){
		printList("");
	}
	public abstract void printList(String prefix);
	
	public String toString(){
		return getName()+"("+getsize()+")";
	}
	
	public String getFullName(){
		StringBuffer fullnamBuffer = new StringBuffer();
		Entry entry=this;
		do {
			fullnamBuffer.insert(0,"/"+entry.getName());
			entry=entry.parent;
		} while (entry != null);
		return fullnamBuffer.toString();
	}
}
