package AdapterModeFileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	@Override
	public void readformFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		load(new FileInputStream(filename));

	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = System.getProperties();
		store(new FileOutputStream(filename), properties.getProperty("user.name"));

	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		setProperty(key, value);

	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return getProperty(key,"");
	}

}
