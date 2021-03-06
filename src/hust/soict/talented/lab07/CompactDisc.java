package hust.soict.talented.lab07;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		
	}
	
	public CompactDisc(String artist, String director, int length, String title, String category, float cost) {
		super(director, length, title, category, cost);
		this.artist = artist;
	}
	
	public CompactDisc(String artist, ArrayList<Track> tracks, String director, int length, String title, String category, float cost) {
		super(director, length, title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track tr) {
		tracks.add(tr);
		System.out.println("The track (" + tr.getTitle() + ", "
										 + tr.getLength() + ") has been added");
	}
	
	public void removeTrack(int id) {
		System.out.println("The track (" + tracks.get(id).getTitle() + ", "
				                         + tracks.get(id).getLength() + ") has been removed");
		for (int j = id; j < tracks.size() - 1; j++) {
			tracks.get(j).setTitle(tracks.get(j + 1).getTitle());
			tracks.get(j).setLength(tracks.get(j + 1).getLength());
		}
		tracks.remove(tracks.size() - 1);
	}
	
	@Override
	public int getLength() {
		int length = 0;
		for (int i = 0; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}
	
	public void play() {
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println("Playing Track " + (i + 1));
			tracks.get(i).play();
		}
	}
}
