package AbstractFactoryListFactory;

import AbstractFactoryMoude.Factory;
import AbstractFactoryMoude.Link;
import AbstractFactoryMoude.Page;
import AbstractFactoryMoude.Tray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length !=1) {
			usage();
			System.exit(0);
		}
		
		Factory factory=Factory.getFactory(args[0]);
		
		Link people = factory.createLink("peoplenews", "http://www.people.com.cn/");
		Link gmw = factory.createLink("gmw", "http://www.gmw.cn/");
		
		Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("jp_Yahoo", "http://www.yahoo.co.jp/");
		Link baidu = factory.createLink("baidu", "http://www.baidu.com/");
		
		
		Tray traynew = factory.createTray("new");
		traynew.add(people);
		traynew.add(gmw);
		
		Tray trayYahoo = factory.createTray("Yahoo");
		trayYahoo.add(us_yahoo);
		trayYahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("Search");
		traysearch.add(trayYahoo);
		traysearch.add(baidu);
		
		Page page = factory.createPage("LinkPage", "caoshuai");
		page.add(traynew);
		page.add(traysearch);
		page.output();

	}
	
	private static void usage() {
		System.out.println("Usage : java main class.name.of.ConcreateFactory");
		System.out.println("Example 1: java main AbstractFactoryListFactory.ListFactory");
		System.out.println("Example 2: java main AbstractFactoryTableFactory.TableFactory");
	}

}
