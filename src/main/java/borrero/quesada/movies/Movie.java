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
        return price.getPriceCode();
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
        return this.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == NEW_RELEASE) && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
