import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("The Lion King", 1994, "Animation", true, 8),
            new Movie("Avengers: Endgame", 2019, "Action", false, 9),
            new Movie("Toy Story", 1995, "Animation", true, 8),
            new Movie("Titanic", 1997, "Drama", false, 9),
            new Movie("Cars", 2006, "Animation", true, 7)
        );

        Profile childProfile = new Profile(new ChildRecommendationStrategy(movies));
        Profile adultProfile = new Profile(new AdultRecommendationStrategy(movies));

        System.out.println("Child Profile Recommendations:");
        childProfile.showRecommendations();

        System.out.println("\nAdult Profile Recommendations:");
        adultProfile.showRecommendations();
    }
}
