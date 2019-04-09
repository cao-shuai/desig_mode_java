package BridgeMode;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class StringDisplay implements DisplayImp {

	private String string;
	private int width;
	
	public StringDisplay(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
		this.width=string.getBytes().length;
	}
	
	@Override
	public void rawopen() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void rawprint() {
		// TODO Auto-generated method stub
		System.out.println("|"+string+"|");
	}

	@Override
	public void rawclose() {
		// TODO Auto-generated method stub
		printLine();
	}
	
	private void printLine(){
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
