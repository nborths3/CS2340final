public class RatingDecorator extends Decorator{

    private int rating;
    public RatingDecorator(Movie movie, int rating) {
        this.movie = movie;
        this.rating = rating;
    }

    public String getSummary() {
        return movie.getSummary() + this.getRating();
    }

    private String getRating() {
        String rat = "; rating: " + String.valueOf(this.rating);
        return rat;
    }

}
