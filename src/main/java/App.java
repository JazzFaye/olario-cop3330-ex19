/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */
import java.util.Scanner;   //Using class scanner

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Create Scanner to obtain input
        //Using try..catch
        try {
            System.out.println("What is your weight in pounds? ");
            String weight = sc.nextLine();  //Obtain input from the user
            double w = Double.parseDouble(weight);  //Convert user input from string to double

            System.out.println("What is your height in inches? ");
            String height = sc.nextLine();  //Obtain input from the user
            double h = Double.parseDouble(height);  //Convert user input from string to double

            double bmi = (w / (h * h)) * 703;   //Formula to get the bmi
            System.out.printf("Your bmi is %.1f.", bmi);    //Display the bmi
            //Using if else statement
            if (bmi < 18.5) {
                //Display this message if bmi is less than 18.5
                System.out.println("\nYou are underweight. You should see your doctor.");
            } else if (bmi > 25) {
                //Display this message if bmi is greater than 25
                System.out.println("\nYou are overweight. You should see you doctor.");
            } else {
                //Display this message if bmi is between or equal (18.5 and 25)
                System.out.println("\nYou are within the ideal weight rage.");
            }
        } catch (NumberFormatException e) {
            //Display the following if the user inputs non numerical values
            System.out.println("Input invalid. Only put numeric values.");
        }
    }
}
