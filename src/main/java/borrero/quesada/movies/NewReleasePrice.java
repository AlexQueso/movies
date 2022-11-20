package borrero.quesada.movies;

public class NewReleasePrice extends Price {

    @Override
    double getCharge(int daysRented) {
        return 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : super.getFrequentRenterPoints(daysRented);
    }
}
