package Singleton;

public class Triple {
	
	private static Triple[] mInstanceTriples  = {null,null,null};
	
	private int id;
	private Triple(int index){
		id=index;
	}
	
	public synchronized static Triple getInstance(int index){
		try {
			if (mInstanceTriples[index]  == null) {
				mInstanceTriples[index]=new Triple(index);
			}
			return mInstanceTriples[index];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("only "+mInstanceTriples.length+" object");
		}
		return null;
	}
		
	
	public void getObjectNumber(){
		System.out.println("Object Number is :"+id);
	}

}
