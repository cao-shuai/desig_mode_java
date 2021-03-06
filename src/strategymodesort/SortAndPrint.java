package strategymodesort;

public class SortAndPrint {
	private Comparable[] data;
	Sorter sorter;
	
	public SortAndPrint(Comparable[] data,Sorter sorter){
		this.data=data;
		this.sorter=sorter;
	}
	
	public void execute() {
		print();
		sorter.sort(data);
		print();
	}
	
	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]+",");
		}
		System.out.println("");
	}

}
