package com.pluralsight;

import java.util.Scanner;

public class Main {

    /**
     * Prompts the user for a double.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the double the user selected.
     */
    public static double promptForDouble(String prompt, Scanner scanner) {

        System.out.print(prompt);
        double result =  scanner.nextDouble();
        scanner.nextLine();
        return result;

    }

    /**
     * Prompts the user for a string.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the string the user selected.
     */
    public static String promptForString(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Prompts the user for an integer.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the int the user selected.
     */
    public static int promptForInt(String prompt, Scanner scanner) {

        System.out.print(prompt);
        int result =  scanner.nextInt();
        scanner.nextLine();
        return result;

    }

    /**
     * Prompts the user for a double.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the double the user selected.
     */
    public static boolean promptForYesNo(String prompt, Scanner scanner) {
return true; //todo: fix this!
//        System.out.print(prompt);
//        double result =  scanner.nextDouble();
//        scanner.nextLine();
//        return result;

    }


    public static void main(){
        Scanner scanner = new Scanner(System.in);


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

        pickupDate = promptForString("Please enter a pickup date: ", scanner);
        numberOfDays = promptForInt("Please enter the number of days for the rental: ", scanner);



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
