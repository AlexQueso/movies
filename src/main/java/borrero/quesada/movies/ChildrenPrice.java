package borrero.quesada.movies;

public class ChildrenPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 0;
        result += 1.5;
        if (daysRented > 3) {
            result += (daysRented - 1) * 1.5;
        }
        return result;
    }
}
