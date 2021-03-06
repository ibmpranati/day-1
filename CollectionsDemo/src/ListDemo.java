import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.set.Book;

public class ListDemo {
	public static void main(String[] args) {
//		demo1();
		bookList();

	}

	public static void bookList() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("Learning Java");
		book1.setPrice(100.0f);
		book1.setPublishYear(1995);
		books.add(book1);
		// books.add(1);
		Book book2 = new Book("Teaching JavaScript");
		book2.setPrice(80.0f);
		book2.setPublishYear(2002);
		books.add(book2);
//		books.remove(1);
		System.out.println(books);

//		Iterator<Book> it = books.iterator();
//		while (it .hasNext()) {
//			Book book = it.next();
//			if (book.getTitle().contains("Learn")) {
//				System.out.println(book);
//			}
//		}

		books.sort(new Comparator<Book>() {
			
			//sorting in ascending order of publish year
			@Override
			public int compare(Book book1, Book o2) {
				return book1.getPublishYear() - book2.getPublishYear();
			}

		});
	}
	// sorting in ascending order of price
	// @Override
//		public int compare(Book book1, Book book2) {			//decide the sorting mechanism
//				return (int)(book1.getPrice() - book2.getPrice());
//			}
//		});

	public static void demo1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
//		list.add("Ram");	//not allowed
		System.out.println("Before - " + list);
//		list.remove(1);
		System.out.println(list.contains(3));
		System.out.println("After - " + list);

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
