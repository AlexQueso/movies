package borrero.quesada.movies;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String rentalRecord() {
        return new RentalRecordBuilder()
                .title(this.name)
                .rentedMovies(rentals)
                .amount(this.getTotalAmount())
                .frequentRenterPoints(this.getTotalFrequentRenterPoints())
                .build();
    }

    private double getTotalAmount (){
        double totalAmount = 0;
        for (Rental each : this.rentals) {
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

    private int getTotalFrequentRenterPoints(){
        int totalFrequentRenterPoints = 0;
        for (Rental each : this.rentals) {
            totalFrequentRenterPoints += each.getFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

}