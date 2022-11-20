package borrero.quesada.movies;

public class ChildrenPrice extends Price{

    private static final double CHARGE = 1.5;
    private static final double EXTRA_CHARGE = 1.5;
    private static final int DAYS_RENTER_THRESHOLD = 3;
    private static final int DAYS_COMPENSATION = 1;

    @Override
    double getCharge(int daysRented) {
        double charge = ChildrenPrice.CHARGE;
        if (daysRented > ChildrenPrice.DAYS_RENTER_THRESHOLD) {
            charge += (daysRented - ChildrenPrice.DAYS_COMPENSATION) * ChildrenPrice.EXTRA_CHARGE;
        }
        return charge;
    }
}
