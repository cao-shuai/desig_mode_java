package IteratorMode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf=new BookShelf(5);
		bookShelf.appedBook(new Book("Around the world in 80 Days"));
		bookShelf.appedBook(new Book("we are famly"));
		bookShelf.appedBook(new Book("Cinderella"));
		bookShelf.appedBook(new Book("Daddy Long Legs"));
		bookShelf.appedBook(new Book("春江花月夜"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book=(Book)it.next();
			System.out.println(book.getName());
		}

	}

}
