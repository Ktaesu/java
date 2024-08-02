package o.collection.list;

public class Music {
	private String title;
	private String artist;
	
	public Music() {
		super();
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override	
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	public void compareTo(Object o) {
		
	}
	
	

}
