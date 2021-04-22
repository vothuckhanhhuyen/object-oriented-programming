package hust.soict.talented.lab05;

class DigitalVideoDisc {
	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
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
