package borrero.quesada.movies;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge(){
        return movie.getCharge(this.daysRented);
    }

    public int getFrequentRenterPoints(){
        return movie.getFrequentRenterPoints(daysRented);
    }
}
