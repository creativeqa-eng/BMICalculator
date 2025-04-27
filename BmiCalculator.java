package day3;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);

        // Get user weight
        System.out.print("Enter your weight in pounds (lbs): ");
        double weightInPounds = scanner.nextDouble();

        // Get user height
        System.out.print("Enter your height in feet: ");
        int heightFeet = scanner.nextInt();

        System.out.print("Enter your height in inches: ");
        int heightInches = scanner.nextInt();

        // Convert height to total inches
        int totalInches = (heightFeet * 12) + heightInches;

        // BMI formula for US units: (weight in pounds / (height in inches)^2) * 703
        double bmi = (weightInPounds / (totalInches * totalInches)) * 703;

        // Output the result
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Optional: classify BMI
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        scanner.close();
    }


	}


