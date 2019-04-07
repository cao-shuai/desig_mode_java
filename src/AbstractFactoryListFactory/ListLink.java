package AbstractFactoryListFactory;

import AbstractFactoryMoude.Link;

public class ListLink extends Link {
	
	public ListLink(String cation,String urlString) {
		// TODO Auto-generated constructor stub
		super(cation, urlString);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return "<li><a href=\""+url+"\">"+captionString+"</a></li>\n";
	}

}
