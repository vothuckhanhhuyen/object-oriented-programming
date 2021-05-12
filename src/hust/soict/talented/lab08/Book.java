package hust.soict.talented.lab08;

import java.util.ArrayList;


public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
		
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Book(String title, String category, ArrayList<String> authors) {
		super(title, category);
		this.authors = authors;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (this.authors.contains(authorName)) {
			System.out.println("This author is already added!");
		} else {
			this.authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if (this.authors.contains(authorName)) {
			this.authors.remove(authorName);
		} else {
			System.out.println("This author is not added!");
		}
	}
}
