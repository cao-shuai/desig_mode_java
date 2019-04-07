package strategymodesort;

public class QuickSorter implements Sorter {
	private Comparable[] data;
	
	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		this.data =data;
		qsorter(0, data.length-1);
	}
	
	private void qsorter(int pre,int post) {
		int saved_pre=pre;
		int saved_post=post;
		Comparable mid =data[(pre+post)/2];
		do {
			
			while (data[pre].compareTo(mid) < 0) {
				pre++;
			}
			while (mid.compareTo(data[post]) < 0) {
				post--;
			}
			if (pre<=post) {
				Comparable tmp =data[pre];
				data[pre]=data[post];
				data[post]=tmp;
				pre++;
				post--;
			}
		} while (pre<=post);
		if (saved_pre < post) {
			qsorter(saved_pre, post);
		}
		if (pre < saved_post) {
			qsorter(pre, saved_post);
		}
	}

}
