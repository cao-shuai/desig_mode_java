package IteratorMode;
import java.util.ArrayList;

public class BookShelf implements Aggregate {

	private ArrayList<Book> booklist;
	
	public BookShelf(int maxsize)
	{
		this.booklist =new ArrayList<Book>(maxsize);
	}
	
	public Book GetBookAt(int index){
		return booklist.get(index);
	}
	
	public void appedBook(Book book){
		this.booklist.add(book);
	}
	
	public int getLength(){
		return booklist.size();
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
}
