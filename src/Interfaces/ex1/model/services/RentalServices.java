package Interfaces.ex1.model.services;

import Interfaces.ex1.model.entities.CarRental;
import Interfaces.ex1.model.entities.Invoice;

import java.time.Duration;

public class RentalServices {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxServices taxServices;

    public RentalServices(Double pricePerHour, Double pricePerDay, TaxServices taxServices) {
        super();
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public void processInvoice (CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
