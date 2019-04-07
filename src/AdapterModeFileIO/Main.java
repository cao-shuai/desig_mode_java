package AdapterModeFileIO;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO fileIO = new FileProperties();
		String inputfile="C:/Users/scott.cao/Desktop/caoshuai.txt";
		String outputfile="C:/Users/scott.cao/Desktop/caoshuai1.txt";
		try {
			fileIO.readformFile(inputfile);
			fileIO.setValue("year", "2019");
			fileIO.setValue("month", "3");
			fileIO.setValue("day", "23");
			fileIO.writeToFile(outputfile);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
