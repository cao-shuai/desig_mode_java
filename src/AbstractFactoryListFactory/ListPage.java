package AbstractFactoryListFactory;

import java.util.Iterator;

import AbstractFactoryMoude.Item;
import AbstractFactoryMoude.Page;

public class ListPage extends Page {

	public ListPage(String titleString,String author) {
		// TODO Auto-generated constructor stub
		super(titleString, author);
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		buffer.append("<html><head><title>"+titleString+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>"+titleString+"</h1>\n");
		buffer.append("<ul>\n");
		Iterator iterator =contentArrayList.iterator();
		while (iterator.hasNext()) {
			Item type = (Item) iterator.next();
			buffer.append(type.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>"+authorString+"</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}

}
