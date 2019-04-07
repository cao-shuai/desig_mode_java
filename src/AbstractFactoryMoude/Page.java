package AbstractFactoryMoude;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
	protected String titleString;
	protected String authorString;
	protected ArrayList contentArrayList=new ArrayList();
	
	public Page(String title,String author){
		this.titleString=title;
		this.authorString=author;
	}
	
	public void add(Item item){
		contentArrayList.add(item);
	}
	
	public void output(){
		try {
			String filename=titleString+".html";
			Writer writer=new FileWriter(filename);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(filename+"编写完成");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public abstract String makeHTML();
}
