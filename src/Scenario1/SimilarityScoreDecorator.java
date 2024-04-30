package Scenario1;

public class SimilarityScoreDecorator extends Decorator{

    private int simScore;

    public SimilarityScoreDecorator(Movie movie, int simScore) {
        this.movie = movie;
        this.simScore = simScore;
    }

    public String getSummary() {
        return movie.getSummary() + this.getSimScore();
    }
    private String getSimScore() {
        return "; similarity score: " + String.valueOf(this.simScore);
    }
}
