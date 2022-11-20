package borrero.quesada.movies;

public class NewReleasePrice extends Price {

    private static final double CHARGE = 3;
    private static final int FREQUENT_RENTER_POINTS = 2;
    private static final int DAYS_RENTER_THRESHOLD = 1;

    @Override
    double getCharge(int daysRented) {
        return NewReleasePrice.CHARGE;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > NewReleasePrice.DAYS_RENTER_THRESHOLD){
            return FREQUENT_RENTER_POINTS;
        } else {
            return super.getFrequentRenterPoints(daysRented);
        }
    }
}
