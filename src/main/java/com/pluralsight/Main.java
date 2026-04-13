package com.pluralsight;

public class Main {
    public static void main(){

        //prompt the user for known values.
        String pickupDate;
        int numberOfDays;
        boolean needsTollTag;
        double priceOfTollTagDaily = 3.95;
        boolean needsGps;
        double priceOfGpsDaily = 2.95;
        boolean needsRoadsideAssistance;
        double priceOfRoadsideAssistanceDaily = 3.95;
        int currentAge;


        //compute unknown values.

        //basic costs
        double costOfBasicCarRental = 0;
        double priceOfBasicCarRentalDaily = 29.99;

        //options
        double costOfOptions = 0;

        //surcharge
        double costOfUnderageSurcharge = 0;
        double underageSurchargeRatePercentage = 0.3; // 30%
        int underageExemptAge = 25;

        //total
        double costTotal = 0;




        //display the output.
        System.out.println("Car Rental Costs:");
        System.out.printf("Basic Costs: %.2f\n", costOfBasicCarRental);
        System.out.printf("Options: %.2f\n", costOfOptions);
        System.out.printf("Surcharge: %.2f\n", costOfUnderageSurcharge);
        System.out.printf("Total: %.2f\n", costTotal);



    }
}
