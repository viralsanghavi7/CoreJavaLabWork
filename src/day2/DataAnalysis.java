package src.day2;

import java.util.Scanner;

/**
 * Created by vsanghav on 8/3/2016.
 */
public class DataAnalysis {

    public static void main(String[] args){

        int total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter count of data items: ");
        total = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[total];

        for(int i=0;i<total;i++){
            System.out.print("Please enter data item "+(i+1)+" : ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mean =" + findMean(numbers));
        System.out.println("Max =" + findMax(numbers));
        System.out.println("Min =" + findMin(numbers));
    }

    public static float findMean(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        return (float)sum/numbers.length;
    }

    public static int findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max)
                max = numbers[i];
        }
        return max;
    }


    public static int findMin(int[] numbers){

        int min = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min)
                min = numbers[i];
        }
        return min;
    }
}


