package AbstractFactoryTableFactory;

import AbstractFactoryMoude.Factory;
import AbstractFactoryMoude.Link;
import AbstractFactoryMoude.Page;
import AbstractFactoryMoude.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String cation, String url) {
		// TODO Auto-generated method stub
		return new TableLink(cation, url);
	}

	@Override
	public Tray createTray(String cation) {
		// TODO Auto-generated method stub
		return new TableTray(cation);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new TablePage(title, author);
	}

}
