package hust.soict.talented.lab08;

class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String director, int length, String title, String category, float cost) {
		super(director, length, title, category, cost);
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
	
	public void play() {
		System.out.println("---------------");
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
