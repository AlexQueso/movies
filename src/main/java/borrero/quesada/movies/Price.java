package borrero.quesada.movies;

public abstract class Price {

    private static final int FREQUENT_RENTER_POINTS = 1;

    abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return Price.FREQUENT_RENTER_POINTS;
    }
}
