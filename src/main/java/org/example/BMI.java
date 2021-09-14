package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class BMI {
    public static void main(String[] args) throws Exception {
        calculateBMI();
    }

    private static void calculateBMI() throws Exception {
        System.out.print("Please enter your weight in pounds: ");
        Scanner input = new Scanner(System.in);
        float weight = input.nextFloat();
        System.out.print("Please enter your height in inches: ");
        float height = input.nextFloat();
        float bmi = 703 * (weight / (height * height));

        System.out.println("Your BMI is: " + bmi);
        printBMICategory(bmi);

    }

    private static void printBMICategory(float bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight. Please consult a doctor.");
        } else if (bmi < 25) {
            System.out.println("You are normal");
        } else {
            System.out.println("You are overweight and consult a doctor.");
        }
    }
}