package AbstractFactoryTableFactory;

import AbstractFactoryMoude.Link;

public class TableLink extends Link {
	
	public TableLink(String cation,String url) {
		// TODO Auto-generated constructor stub
		super(cation, url);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return "<td><a href=\""+url+"\">"+captionString+"</a></td>\n";
	}

}
