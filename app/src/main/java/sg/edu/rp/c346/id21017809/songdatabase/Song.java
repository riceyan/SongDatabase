package sg.edu.rp.c346.id21017809.songdatabase;

public class Song {
    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public int getId() {
        return id;
    }
    public Song(String title, String singers, int year, int stars) {
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public int getYear() {
        return year;
    }

    public int getStars() {
        return stars;
    }

}
