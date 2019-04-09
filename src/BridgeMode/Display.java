package BridgeMode;

public class Display {
	private DisplayImp displayImp;
	
	public Display(DisplayImp displayImp){
		this.displayImp=displayImp;
	}
	
	public void open(){
		displayImp.rawopen();
	}
	
	public void print(){
		displayImp.rawprint();
	}
	
	public void close(){
		displayImp.rawclose();
	}
	
	public final void display(){
		open();
		print();
		close();
	}

}
