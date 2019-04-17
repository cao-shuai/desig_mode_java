package CompositeMode;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class File extends Entry {
	
	private String filename;
	private int filesize;
	
	public File(String filename,int size){
		this.filename=filename;
		this.filesize=size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return filename;
	}

	@Override
	public long getsize() {
		// TODO Auto-generated method stub
		return filesize;
	}

	@Override
	public void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix+"/"+this);
	}

}
