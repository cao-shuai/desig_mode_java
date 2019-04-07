package strategyMode;

public class Hand {
	
	public static final int HANDVALUE_GUU=0;  //means stone
	public static final int HANDVALUE_CHO=1;  //means Scissors
	public static final int HANDVALUE_PAA=2;  //means paper
	public static final Hand[] hand={
			new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA),
	};
	
	//��ʾ������������Ӧ���ַ���
	private static final String[] name = {
			"ʯͷ","����","��",
	};
	
	private int handvalue; //���г�������ֵ
	
	private Hand(int handvalue){
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue){
		return hand[handvalue];
	}
	
	public boolean isStrongerThan(Hand h){
		return fight(h) == 1;
	}
	
	public boolean isWwakerThan(Hand h){
		return fight(h) == -1;
	}
	
	//平: 0 ;  胜 : 1 ; 负: -1
	private int fight(Hand h){
		if (this == h){
			return 0;
		}else if((this.handvalue+1)%3 == h.handvalue){
			return 1;
		}else{
			return -1;
		}
		
	}
	
	@Override
	public String toString(){
		return name[handvalue];
	}
}
