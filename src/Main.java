public class Main {
    public static void main(String[] args) {
        Movie movie1 = new BaseMovie("Titanic");
        System.out.println(movie1.getSummary());

        movie1 = new RatingDecorator(movie1, 6);
        System.out.println(movie1.getSummary());

        movie1 = new SimilarityScoreDecorator(movie1, 7);
        System.out.println(movie1.getSummary());

        movie1 = new FavoritesDecorator(movie1, "no");
        System.out.println(movie1.getSummary());


        Movie movie2 = new BaseMovie("Harry Potter 1");
        System.out.println(movie2.getSummary());
        movie2 = new FavoritesDecorator(movie2, "yes");
        System.out.println(movie2.getSummary());
        movie2 = new RatingDecorator(movie2, 8);
        System.out.println(movie2.getSummary());
        movie2 = new SimilarityScoreDecorator(movie2, 3);
        System.out.println(movie2.getSummary());



    }
}