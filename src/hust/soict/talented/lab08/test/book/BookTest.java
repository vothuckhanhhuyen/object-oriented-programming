/**
 * 
 */
package hust.soict.talented.lab08.test.book;

import hust.soict.talented.lab08.disc.Book;

/**
 * @author vothuckhanhhuyen
 *
 */
public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Mat Biec", "Kids", 120);
		b.addAuthor("Nguyen Nhat Anh");
		b.setContent("Truyen thieu nhi duoc nhieu tre em tren ca nuoc yeu thich, la truyen ban chay nhat.");
		b.processContent();
		System.out.println(b.toString());
	}

}
