package BuilderMode;

public class Director {
	
	private Builder mBuilder=null;
	
	public Director(Builder builder){
		mBuilder=builder;
	}
	
	public void construct(){
		mBuilder.makeTitle("Greeting");
		
		mBuilder.makeString("from mornig to afternoon");
		mBuilder.makeItems(new String[]{
				"good morning",
				"good afternoon"
		});
		
		mBuilder.makeString("night");
		mBuilder.makeItems(new String[]{
				"good evening",
				"good night",
				"see you"
		});
		
		mBuilder.close();		
	}

}
