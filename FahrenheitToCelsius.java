/**
 * Created by vsanghav on 8/2/2016.
 */

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a Fahrenheit temperature");
        String line = sc.nextLine();
        double f = Double.valueOf(line);
        double c = 5*(f-32)/9;
        System.out.println("The Celsius temperature is: "+ c);

    }
}
