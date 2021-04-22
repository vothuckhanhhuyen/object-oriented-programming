package hust.soict.talented.lab07;

public class Disc extends Media {
	private int length;
	private String director;
	
	public Disc() {
		
	}
	
	public Disc(String director) {
		this.director = director;
	}
	
	public Disc(String director, int length) {
		this(director);
		this.length = length;
	}
	
	public Disc(String director, int length, String title, String category, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
}
