package hust.soict.talented.lab10.disc;

import hust.soict.talented.lab10.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
	/**
	 * 
	 */
	public DigitalVideoDisc() {
		
	}
	/**
	 * @param title
	 */
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	/**
	 * @param director
	 * @param length
	 * @param title
	 * @param category
	 * @param cost
	 */
	public DigitalVideoDisc(String director, int length, String title, String category, float cost) {
		super(director, length, title, category, cost);
	}
	
	/**
	 * @param title
	 * @return
	 */
	public boolean search(String title) {
		String[] titleTokens = title.toLowerCase().split(" ");
		for (String token : titleTokens) {
			if (this.title.toLowerCase().indexOf(token) < 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 *
	 */
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("---------------");
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}
	
	/**
	 *
	 */
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof DigitalVideoDisc)) {
			return o.getClass().toString().compareTo(DigitalVideoDisc.class.toString());
		} else {
			DigitalVideoDisc item = (DigitalVideoDisc) o;
			if (Float.compare(this.getCost(), item.getCost()) != 0) {
				return Float.compare(this.getCost(), item.getCost());
			} else {
				return Integer.compare(this.getLength(), item.getLength());
			}
		}
	}
}
