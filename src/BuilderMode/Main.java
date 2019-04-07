package BuilderMode;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length !=1) {
			usage();
			System.exit(0);
		}
		
		if (args[0].equals("plain")) {
			TextBuilder textBuilder=new TextBuilder();
			Director director=new Director(textBuilder);
			director.construct();
			String result=textBuilder.getResult();
			System.out.println(result);
			
		}else if (args[0].equals("html")) {
			HTMLBulider htmlBulider=new HTMLBulider();
			Director director=new Director(htmlBulider);
			director.construct();
			String filename=htmlBulider.getResult();
			System.out.println(filename+"文件编写完成");
		}else if (args[0].equals("JFrame")) {
			FrameBuilder frameBuilder=new FrameBuilder();
			Director director=new Director(frameBuilder);
			director.construct();
			JFrame frame=frameBuilder.getResult();
			frame.setVisible(true);
		}else {
			usage();
			System.exit(0);
		}
	}
	
	public static void usage(){
		System.out.println("Usage: java Main plain");
		System.out.println("Usage: java Main html");
	}

}
