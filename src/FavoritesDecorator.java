public class FavoritesDecorator extends Decorator{

    private String fav;
    public FavoritesDecorator(Movie movie, String fav) {
        this.movie = movie;
        this.fav = fav;
    }
    public String getSummary() {
        return movie.getSummary() + this.getFav();
    }

    private String getFav() {
        return "; favorites: " + this.fav;
    }
}
