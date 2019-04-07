package factoryMode;

public class IDCardProduct extends Product {
	private String Owner;
	private long serialnumber;
	
	IDCardProduct(String ownerString,long serialnumber) {
		// TODO Auto-generated constructor stub
		System.out.println("<-制作"+ownerString+"的ID卡; 卡号为:"+serialnumber+"->");
		Owner=ownerString;
		this.serialnumber=serialnumber;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("<-使用"+Owner+"的ID卡; 卡号为:"+serialnumber+"->");
	}
	
	public String GetOwner() {
		return Owner;
	}
	
	public long getIDNumber() {
		return serialnumber;
	}

}
