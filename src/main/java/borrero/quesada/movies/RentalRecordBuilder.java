package borrero.quesada.movies;

import java.util.List;

public class RentalRecordBuilder {

    private String title = "";
    private String amount = "";
    private String frequentRenterPoints = "";
    private String rentedMovies = "";

    public RentalRecordBuilder title(String name) {
        this.title = "Rental Record for " + name + "\n";
        return this;
    }

    public RentalRecordBuilder rentedMovies(List<Rental> rentals) {
        for (Rental rental: rentals){
            this.rentedMovies += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }
        return this;
    }

    public RentalRecordBuilder amount (double amount){
        this.amount = "Amount owed is " + amount + "\n";
        return this;
    }

    public RentalRecordBuilder frequentRenterPoints(int frequentRenterPoints){
        this.frequentRenterPoints = "You earned " + frequentRenterPoints + " frequent renter points";
        return this;
    }

    public String build(){
        return this.title + rentedMovies + amount + frequentRenterPoints;
    }
    
}
