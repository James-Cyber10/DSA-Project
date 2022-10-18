
public class Song {
    public  String title;
    public  String artist;
    public  String album;
    //private String title;
    private double duration;

//    public Song(String title, double duration) {
//        this.title = title;
//        this.duration = duration;
//    }
    public Song(String songTitle, String artistName, String albumName, double duration) {
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.duration = duration;
}

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
    
     public void setArtist(String artistName) {
      artist = artistName;
   }
   public String getArtist() {
      return artist;
   }
   public void setAlbum(String albumName) {
      album = albumName;
   }
   public String getAlbum() {
      return album;
   }
 
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
