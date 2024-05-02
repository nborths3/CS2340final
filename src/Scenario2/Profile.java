public class Profile {
    private RecommendationStrategy recommendationStrategy;

    public Profile(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public void setRecommendationStrategy(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public void showRecommendations() {
        recommendationStrategy.recommendMovies();
    }
}
