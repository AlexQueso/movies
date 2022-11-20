package borrero.quesada.movies;

public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPrice();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR -> this.price = new RegularPrice();
            case NEW_RELEASE -> this.price = new NewReleasePrice();
            case CHILDREN -> this.price = new ChildrenPrice();
        }
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented){
        double result = 0;
        switch (this.getPriceCode()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                result += 3;
                break;
            case CHILDREN:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 1) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == NEW_RELEASE) && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
