package test240726.object2;

public class Music {
	
	private String title;
	private String singer;

	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return title + " - " + singer;
	}
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals(Object obj) {
		Music m = (Music)obj;
		if(this.singer.equals(m.getSinger()) &&
				this.title.equals(m.getTitle())) {
			return true;
		}
		return false;
	}
	
	public int compareTo(Object o) {
		return 0;
	}
	

}
