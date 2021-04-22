package hust.soict.talented.lab06;

class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
	public DigitalVideoDisc() {
		
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public boolean search(String title) {
		String[] titleTokens = title.toLowerCase().split(" ");
		for (String token : titleTokens) {
			if (this.title.toLowerCase().indexOf(token) < 0) {
				return false;
			}
		}
		return true;
	}
}
