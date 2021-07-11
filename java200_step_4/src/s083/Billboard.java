package s083;

import java.io.Serializable;

public class Billboard implements Serializable{
	private int rank;
	private String song;
	private int lastweek;
	private String imagesrc;
	private String artistsrc;
	private String artist;
	public Billboard() {}
	
	public Billboard(int rank,String song, int lastweek, String imagesrc, String artistsrc, String artist) {
		super();
		this.rank = rank;
		this.song = song;
		this.lastweek=lastweek;
		this.imagesrc = imagesrc;
		this.artistsrc = artistsrc;
		this.artist = artist;
	}
	
	public Billboard(int rank,String song, int lastweek, String imagesrc, String artist) {
		super();
		this.rank = rank;
		this.song = song;
		this.lastweek=lastweek;
		this.imagesrc = imagesrc;
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "[rank = "+rank+", song = " + song + ", laskweek = "+ lastweek + ", imagesrc ="+imagesrc+", artist = " + artist+"]";
	}
	public int getRank() {
		return rank;
	}
	public void SetRank(int rank) {
		this.rank = rank;
	}
	public String getSong() {
		return song;
	}
	public void SetSong(String song) {
		this.song = song;
	}
	public int getLastweek() {
		return lastweek;
	}
	public void SetLastweek(int lastweek) {
		this.lastweek = lastweek;
	}
	public String getImageSrc() {
		return imagesrc;
	}
	public void SetImageSrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}
	public String getArtistSrc() {
		return artistsrc;
	}
	public void SetArtistSrc(String artistsrc) {
		this.artistsrc = artistsrc;
	}
	public String getArtist() {
		return artist;
	}
	public void SetArtist(String artist) {
		this.artist = artist;
	}
	
	
}
