package IteratorMode;

public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index=0;

	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf=bookShelf;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (index < bookShelf.getLength()){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book=bookShelf.GetBookAt(index);
		index++;
		return book;
	}

}
