package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user for a double.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the double the user selected.
     */
    public static double promptForDouble(String prompt) {

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
    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Prompts the user for an integer.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the int the user selected.
     */
    public static int promptForInt(String prompt) {

        System.out.print(prompt);
        int result =  scanner.nextInt();
        scanner.nextLine();
        return result;

    }

    /**
     * Prompts the user for a Yes or No which is returned as a boolean.
     * @param prompt to display the user
     * @param scanner to interact with user
     * @return the boolean
     */
    public static boolean promptForYesNo(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("YES");
        //opportunity to enhance this with some error protection.
    }

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

        pickupDate = promptForString("Please enter a pickup date: ");
        numberOfDays = promptForInt("Please enter the number of days for the rental: ");
        needsTollTag = promptForYesNo("Do you need a electronic Toll Tag (yes/no): ");
        needsGps = promptForYesNo("Do you need a GPS device (yes/no): ");
        needsRoadsideAssistance = promptForYesNo("Do you need roadside assistance (yes/no): ");
        currentAge = promptForInt("How old are you: ");

        //compute unknown values.

        //basic costs
        double priceOfBasicCarRentalDaily = 29.99;
        double costOfBasicCarRental = priceOfBasicCarRentalDaily * numberOfDays;

        //options

        //option1
        double costOfGps = (needsGps) ? (priceOfGpsDaily * numberOfDays) : 0;
        double costOfTollTag = (needsTollTag) ? (priceOfTollTagDaily * numberOfDays) : 0;
        double costOfRoadsideAssistance = (needsRoadsideAssistance) ? (priceOfRoadsideAssistanceDaily * numberOfDays) : 0;
        double costOfOptions = costOfGps + costOfTollTag + costOfRoadsideAssistance;

        //surcharge
        double underageSurchargeRatePercentage = 0.3; // 30%
        int underageExemptAge = 25;

        double costOfUnderageSurcharge = (currentAge < underageExemptAge) ? (costOfBasicCarRental * underageSurchargeRatePercentage) : 0;

        //total
        double costTotal = costOfBasicCarRental + costOfOptions + costOfUnderageSurcharge;

        //display the output.
        System.out.println("Car Rental Costs:");
        System.out.printf("Basic Costs: %.2f\n", costOfBasicCarRental);
        System.out.printf("Options: %.2f\n", costOfOptions);
        System.out.printf("Surcharge: %.2f\n", costOfUnderageSurcharge);
        System.out.printf("Total: %.2f\n", costTotal);

    }
}
