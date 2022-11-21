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
        String rentalRecord = this.rentalRecordTitle();
        for (Rental rental: this.rentals){
            rentalRecord += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }
        rentalRecord += this.rentalRecordTotalAmount();
        rentalRecord += this.rentalRecordTotalFrequentRenterPoints();
        return rentalRecord;
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

    private String rentalRecordTitle(){
        return "Rental Record for " + this.getName() + "\n";
    }

    private String rentalRecordTotalAmount(){
        return "Amount owed is " + this.getTotalAmount() + "\n";
    }

    private String rentalRecordTotalFrequentRenterPoints(){
        return "You earned " + this.getTotalFrequentRenterPoints() + " frequent renter points";
    }

}