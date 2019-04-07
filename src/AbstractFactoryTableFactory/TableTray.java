package AbstractFactoryTableFactory;

import java.util.Iterator;

import AbstractFactoryMoude.Item;
import AbstractFactoryMoude.Tray;

public class TableTray extends Tray {
	
	public TableTray(String catString) {
		// TODO Auto-generated constructor stub
		super(catString);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer();
		buffer.append("<td>");
		buffer.append("<table width=\"100%\" border=\"1\"><tr>");
		buffer.append("<td bgcolor=\"#CCCCCC\" align=\"center\" colspan=\""+tray.size()+"\"><b>"+captionString+"</b></td>");
		buffer.append("</tr>\n");
		buffer.append("<tr>\n");
		Iterator iterator=tray.iterator();
		while (iterator.hasNext()) {
			Item type = (Item) iterator.next();
			buffer.append(type.makeHTML());
		}
		buffer.append("</tr></table>");
		buffer.append("</td>");
		return buffer.toString();
	}

}
