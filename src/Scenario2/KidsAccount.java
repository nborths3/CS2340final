import java.util.List;
import java.util.stream.Collectors;

public class KidsAccount implements RecommendationStrategy {
    private List<Movie> movies;

    public KidsAccount(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public void recommendMovies() {
        List<Movie> recommendations = movies.stream()
            .filter(movie -> movie.getGenre().equals("Family") || movie.getGenre().equals("Animation"))
            .filter(movie -> movie.isKidFriendly())
            .sorted((a, b) -> b.getRating() - a.getRating())
            .limit(5)
            .collect(Collectors.toList());

        System.out.println("Kid-Friendly Movie Recommendations:");
        recommendations.forEach(movie -> System.out.println(movie.getTitle() + " (" + movie.getYear() + ")"));
    }
}
