package CompositeMode;

import java.util.ArrayList;

import java.util.Iterator;

public class Directory extends Entry {

	private String directoryname;
	private ArrayList directoryArrayList=new ArrayList();
	
	public Directory(String name) {
		// TODO Auto-generated constructor stub
		directoryname=name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return directoryname;
	}

	@Override
	public long getsize() {
		// TODO Auto-generated method stub
		int size=0;
		Iterator iterator = directoryArrayList.iterator();
		while (iterator.hasNext()) {
			Entry type = (Entry) iterator.next();
			size+=type.getsize();
		}
		return size;
	}

	@Override
	public void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix+"/"+this);
		Iterator iterator= directoryArrayList.iterator();
		while (iterator.hasNext()) {
			Entry type = (Entry) iterator.next();
			type.printList(prefix+"/"+directoryname);
		}
	}
	
	public Entry add(Entry entry){
		directoryArrayList.add(entry);
		entry.parent=this;
		return this;
	}
}
