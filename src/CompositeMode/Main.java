package CompositeMode;

import com.sun.scenario.effect.impl.prism.PrImage;

import javafx.geometry.Side;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Making root entries....");
			Directory rootdirDirectory = new Directory("root");
			Directory binDirectory=new Directory("bin");
			Directory tmpDirectory=new Directory("tmp");
			Directory usrDirectory=new Directory("usr");
			
			rootdirDirectory.add(binDirectory);
			rootdirDirectory.add(tmpDirectory);
			rootdirDirectory.add(usrDirectory);
			
			binDirectory.add(new File("vi", 1000));
			binDirectory.add(new File("latex", 20));
			
			rootdirDirectory.printList();
			
			System.out.println("Making user entries....");
			Directory caoshuaiDirectory=new Directory("caoshuai");
			Directory yangjunDirectory=new Directory("yangjun");
			Directory shiyuDirectory=new Directory("caoyangshiyu");
			
			usrDirectory.add(caoshuaiDirectory);
			usrDirectory.add(yangjunDirectory);
			usrDirectory.add(shiyuDirectory);
			File file=new File("caoshuai.html", 200);
			caoshuaiDirectory.add(file);
			caoshuaiDirectory.add(new File("composite.java", 100));
			
			yangjunDirectory.add(new File("memo.text", 100));
			shiyuDirectory.add(new File("yuwen.text", 1000));
			shiyuDirectory.add(new File("shuxue.text", 1000));
			usrDirectory.printList();
			
			System.out.println("file = "+file.getFullName());
			
		} catch (FileTreatementException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
