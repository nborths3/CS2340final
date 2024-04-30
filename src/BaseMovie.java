public class BaseMovie implements Movie {

    String title;

    public BaseMovie(String title) {
        this.title = title;
    }
    @Override
    public String getSummary() {
        return "Title: " + title;
    }
}
