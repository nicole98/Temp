/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconverter;

import java.util.Scanner;

/**
 * Performs a temperature conversion.
 */
public class TempConverter {

       public static double fahrenheitToCelsius(double temp) {
               double cTemp;

               cTemp = (double)5/(double)9*(temp - 32);
               return cTemp;
       }

       public static double celsiusToFahrenheit(double temp) {
               double fTemp;

               fTemp = (double)9/(double)5*temp + 32;
               return fTemp;
       }


       public static void main(String[] args) {
               int choice;
               Scanner input = new Scanner(System.in);
               double tempurature;

               /* Prompt user for type of conversion */
               System.out.println("1. Fahrenheit to Celsius conversion.");
               System.out.println("2. Celsius to Fahrenheit conversion.");
               System.out.print("Enter your choice: ");
               choice = input.nextInt();
               System.out.print("Enter the tempurature: ");
               tempurature = input.nextDouble();
               if (choice == 1) {
                    System.out.println("The Celsius temperature is " + fahrenheitToCelsius(tempurature));
               } else {
                    System.out.println("The Fahrenheit temperature is " + celsiusToFahrenheit(tempurature));
               }
               input.close();
       }
}
