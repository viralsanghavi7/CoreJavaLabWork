package src.day5;

import src.day4.MortgageAccount;

import java.util.Scanner;

/**
 * Created by vsanghav on 8/9/2016.
 */
public class CustomException {

    public enum Months{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMER,DECEMEBER;
    }

    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public  void isValid(String month, int day) throws BadMonth, BadDay {

        Months m = null;
        try{
            m = Months.valueOf(month);

        }catch(IllegalArgumentException e){
            throw new BadMonth("Not a valid month",e);
        }
        if(days[m.ordinal()]!=day){
            throw new BadDay("Not valid number of days in this month");
        }

        System.out.println("Valid combination! Good job");
    }

    public static void main(String[] args){

        CustomException c = new CustomException();

        Scanner sc = new Scanner(System.in);
        String month = null;
        int days = 0;
        do {
            try {
                System.out.println("Enter a Month:");
                month = sc.nextLine();
                System.out.println("Enter days:");
                days = Integer.parseInt(sc.nextLine());
                c.isValid(month,days);
            } catch(BadMonth bm) {
                System.out.println(bm.getMessage());
                System.out.println(bm.getCause());
            } catch (BadDay bd) {
                System.out.println(bd.getMessage());
            }

        } while(!month.equalsIgnoreCase("Quit"));


    }
}


