package day01_song;

public class Song {
/*	노래의 제목을 나타내는 title
	가수를 나타내는 artist
	노래가 속한 앨범 제목을 나타내는 album
	노래의 작곡가를 나타내는 composer
	노래가 발표된 연도를 나타내는 year
	노래가 속한 앨범에서 트랙 번호를 나타내는 track
*/

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
/*	public Song() {
		super();
	}
*/	
	public Song(String title, String artist){
		this(title, artist, "","",0,0);
	}
	
	public Song(String title, String artist, String album, String composer,
			int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
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
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album="
				+ album + ", composer=" + composer + ", year=" + year
				+ ", track=" + track + "]";
	}
	
	public void show(){
		String str = artist+" "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )";
		System.out.println(str);
	}
	
}
