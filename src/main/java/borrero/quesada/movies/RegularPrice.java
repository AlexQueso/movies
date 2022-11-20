package borrero.quesada.movies;

public class RegularPrice extends Price{
    @Override
    int getPriceCode() {
        int regular = Movie.REGULAR;
        return regular;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 0;
        result += 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
