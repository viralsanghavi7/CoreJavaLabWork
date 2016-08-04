package src.day4;

/**
 * Created by vsanghav on 8/4/2016.
 */

import java.util.concurrent.ThreadLocalRandom;
public class Casino {

    public enum Casino_Wheel{
        BAR, MEDAL, COIN, TRIPLE_BAR, CHERRY
    }

    public static void main(String[] args){

        for(int i=0;i<3;i++){

            int randomValue = ThreadLocalRandom.current().nextInt(Casino_Wheel.values().length);
            System.out.println(Casino_Wheel.values()[randomValue]);
        }
    }
}
