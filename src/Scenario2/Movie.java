public class Movie {
    private String title;
    private int year;
    private String genre;
    private boolean kidFriendly;
    private int rating;

    public Movie(String title, int year, String genre, boolean kidFriendly, int rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.kidFriendly = kidFriendly;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isKidFriendly() {
        return kidFriendly;
    }

    public int getRating() {
        return rating;
    }
}
