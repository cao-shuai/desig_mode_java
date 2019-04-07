package strategymodesort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = {"Dumpty","Bowan","Carroll","Elfland","Alice",};
		SortAndPrint sap=new SortAndPrint(data, new SelectionSorter());
		sap.execute();
		
		String[] data1 = {"Dumpty","Bowan","Carroll","Elfland","Alice",};
		SortAndPrint sap1 = new SortAndPrint(data1, new QuickSorter());
		sap1.execute();
	}

}
