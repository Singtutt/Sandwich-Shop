package com.pluralsight;

import java.util.Scanner;

public class SandwichShopCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the size of the sandwich (Query 1)
        System.out.println("Sandwich Sizes:");
        System.out.println("1. Regular - $5.45");
        System.out.println("2. Large - $8.95");
        System.out.print("What size sandwich would you like? (Please choose either: 1 for Regular or 2 for Large): ");
        int sandwichSize = input.nextInt();

        // Prompt the user for their age (Query 2)
        System.out.print("How old are you? ");
        int age = input.nextInt();

        double basePrice;

        // Determine the base price from sandwich size (Pre-Calculation)
        if (sandwichSize == 1) {
            basePrice = 5.45;
        } else if (sandwichSize == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size selection. (Please choose either: 1 for Regular or 2 for Large): ");
            return;
        }

        // Calculate the discount based on age (Discount Calculation)
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% discount for students, 17 or younger
        } else if (age >= 65) {
            discount = 0.20; // 20% discount for seniors, 65 or older
        }

        // Calculate the final cost of the sandwich after applying the discount (Total Calculation)
        double finalCost = basePrice - (basePrice * discount);

        // Display the cost of the sandwich to the screen
        System.out.printf("The cost of your sandwich: $%.2f%n", finalCost);
    }
}