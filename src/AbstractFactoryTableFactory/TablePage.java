package AbstractFactoryTableFactory;

import java.util.Iterator;

import AbstractFactoryMoude.Item;
import AbstractFactoryMoude.Page;

public class TablePage extends Page {

	public TablePage(String title,String author) {
		// TODO Auto-generated constructor stub
		super(title, author);
	}
	
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		buffer.append("<html><head><title>"+titleString+"</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>"+titleString+"</h1>\n");
		buffer.append("<table width=\"80%\" border=\"3\">\n");
		Iterator iterator = contentArrayList.iterator();
		while (iterator.hasNext()) {
			Item item = (Item) iterator.next();
			buffer.append("<tr>"+item.makeHTML()+"</tr>");
		}
		buffer.append("</table>\n");
		buffer.append("<hr><address>"+authorString+"</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}

}
