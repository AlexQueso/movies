package borrero.quesada.movies;

public class RegularPrice extends Price{

    private static final double CHARGE = 2;
    private static final int DAYS_RENTER_THRESHOLD = 2;
    private static final double EXTRA_CHARGE = 1.5;
    private static final int DAYS_COMPENSATION = 2;

    @Override
    double getCharge(int daysRented) {
        double charge = RegularPrice.CHARGE;
        if (daysRented > RegularPrice.DAYS_RENTER_THRESHOLD) {
            charge += (daysRented - RegularPrice.DAYS_COMPENSATION) * RegularPrice.EXTRA_CHARGE;
        }
        return charge;
    }
}
