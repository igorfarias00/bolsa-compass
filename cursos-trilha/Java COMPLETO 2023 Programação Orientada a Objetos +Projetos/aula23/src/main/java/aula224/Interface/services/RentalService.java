package aula224.Interface.services;

import aula224.Interface.entities.CarRental;
import aula224.Interface.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;


    public RentalService() {
    }

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;



        double basicPayment;

        if(hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);

        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }



        double tax = taxService.tax(basicPayment);

//        System.out.println("=====================================");
//        System.out.println("Minutes : " + minutes);
//        System.out.println("Hours: " + hours);
//        System.out.println("Days: " + hours / 24.0);
//        System.out.println("Basic: " + basicPayment);
//        System.out.println("Tax: " + tax);
//
//        System.out.println("=========================");

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    // ++++++++++++++++++++++++++++++--------------------------

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(BrazilTaxService taxService) {
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
