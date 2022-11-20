package borrero.quesada.movies;

public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 0;
        result += 3;
        return result;
    }
}
