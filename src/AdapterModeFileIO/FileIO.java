package AdapterModeFileIO;

import java.io.IOException;

public interface FileIO {
	public void readformFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key,String value);
	public String getValue(String key);
}
