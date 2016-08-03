package src.day2;

import java.util.Scanner;

/**
 * Created by vsanghav on 8/2/2016.
 */
public class DayOfTheWeek {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String dayText;
        int day,month,year;
        int partA,partB,partC,partD;
        int result;

        boolean timeToQuit = false;


        while(timeToQuit==false) {

            System.out.print("Please enter day: ");
            dayText = sc.nextLine();
            timeToQuit = "quit".equalsIgnoreCase(dayText);
            if(timeToQuit==true)
                continue;

            day = Integer.parseInt(dayText);

            System.out.print("Please enter month: ");
            month = Integer.parseInt(sc.nextLine());

            System.out.print("Please enter year: ");
            year = Integer.parseInt(sc.nextLine());

            if(month<3){
                month = month+12;
                year = year -1;
            }

            partA =  13*(month+1)/5;
            partB = year/4;
            partC = 6* (year/100);
            partD = year/400;

            result = (day+year+partA+partB+partC+partD)%7;

            System.out.println("The day of the week is: "+ getDayFromNum(result));
        }
    }

    private static String getDayFromNum(int num) {

        String day = "";
        switch (num) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
        }

        return day;
    }
}
