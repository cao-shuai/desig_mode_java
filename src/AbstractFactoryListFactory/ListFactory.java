package AbstractFactoryListFactory;

import AbstractFactoryMoude.Factory;
import AbstractFactoryMoude.Link;
import AbstractFactoryMoude.Page;
import AbstractFactoryMoude.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String cation, String url) {
		// TODO Auto-generated method stub
		return new ListLink(cation,url);
	}

	@Override
	public Tray createTray(String cation) {
		// TODO Auto-generated method stub
		return new ListTray(cation);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new ListPage(title,author);
	}

}
