package AbstractFactoryListFactory;

import java.util.Iterator;

import AbstractFactoryMoude.Item;
import AbstractFactoryMoude.Tray;

public class ListTray extends Tray {
	
	public ListTray(String cationstring) {
		// TODO Auto-generated constructor stub
		super(cationstring);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(captionString+"\n");
		buffer.append("<ul>\n");
		Iterator iterator =tray.iterator();
		
		while (iterator.hasNext()) {
			Item item=(Item)iterator.next();
			buffer.append(item.makeHTML());
		}
		
		buffer.append("</ul>\n");
		buffer.append("</li>\n");
		return buffer.toString();
	}

}
