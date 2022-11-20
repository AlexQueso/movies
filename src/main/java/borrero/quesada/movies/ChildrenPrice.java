package borrero.quesada.movies;

public class ChildrenPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 3) {
            return 1.5 + (daysRented - 1) * 1.5;
        }
        return 1.5;
    }
}