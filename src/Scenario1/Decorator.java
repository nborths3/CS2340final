package Scenario1;

public abstract class Decorator implements Movie {
    protected Movie movie;

    @Override
    public String getSummary() {
        return movie.getSummary();
    }


}
