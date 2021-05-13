package hust.soict.talented.lab10.disc;

import hust.soict.talented.lab10.exception.PlayerException;

public class Track implements Playable, Comparable<Object> {
	private String title;
	private int length;
	
	/**
	 * 
	 */
	public Track() {
		
	}
	/**
	 * @param title
	 */
	public Track(String title) {
		this.title = title;
	}
	/**
	 * @param title
	 * @param length
	 */
	public Track(String title, int length) {
		this(title);
		this.length = length;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Track)) {
			return false;
		}
		else {
			Track newTrack = (Track) obj;
			if (newTrack.length == this.length && newTrack.title == this.title) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 *
	 */
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Track)) {
			return o.getClass().toString().compareTo(Track.class.toString());
		} else {
			Track item = (Track) o;
			return Integer.compare(this.getLength(), item.getLength());
		}
	}
}
