package t161201;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionEach {

	public static void main(String[] args) {
//		String a = "";
		Collection<String> books = new HashSet<String>();
		books.add("123");
		books.add("345");
		books.add("456");
////		Lambda
//		books.forEach(obj -> System.out.println("��������Ԫ�أ�"+obj));
//		#########################################################
		Iterator<String> it = books.iterator();
		while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("345"))
			{
				it.remove();
//				books.remove(book);
			}
//			book = "test";
//			System.out.println(book);
		}
		System.out.println(books);
//		System.out.println(a);
	}
}
