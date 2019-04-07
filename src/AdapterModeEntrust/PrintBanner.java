package AdapterModeEntrust;
import AdapterMode.Banner;

public class PrintBanner extends Print {
	
	private Banner mBanner;
	
	public PrintBanner(String string) {
		this.mBanner=new Banner(string);
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		mBanner.showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		mBanner.showWithAster();
	}

}
