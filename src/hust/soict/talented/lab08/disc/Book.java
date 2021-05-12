package hust.soict.talented.lab08.disc;

import java.util.ArrayList;


public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	/**
	 * 
	 */
	public Book() {
		
	}
	/**
	 * @param title
	 */
	public Book(String title) {
		super(title);
	}
	/**
	 * @param title
	 * @param category
	 */
	public Book(String title, String category) {
		super(title, category);
	}
	/**
	 * @param title
	 * @param category
	 * @param cost
	 */
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	/**
	 * @param title
	 * @param category
	 * @param cost
	 * @param authors
	 */
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}

	/**
	 * @return authors
	 */
	public ArrayList<String> getAuthors() {
		return authors;
	}
	/**
	 * @param authors
	 */
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	/**
	 * @param authorName
	 */
	public void addAuthor(String authorName) {
		if (this.authors.contains(authorName)) {
			System.out.println("This author is already added!");
		} else {
			this.authors.add(authorName);
		}
	}
	
	/**
	 * @param authorName
	 */
	public void removeAuthor(String authorName) {
		if (this.authors.contains(authorName)) {
			this.authors.remove(authorName);
		} else {
			System.out.println("This author is not added!");
		}
	}
}
