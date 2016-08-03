package src.day3;

/**
 * Created by vsanghav on 8/3/2016.
 */


import java.io.BufferedReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reading {

    private String day;
    private int hour;
    private int temp;
    private int windSpeed;

    public Reading(String data){

        String[] elements = data.split(", ");
        this.day = elements[0];
        this.hour = Integer.valueOf(elements[1]);
        this.temp = Integer.valueOf(elements[2]);
        this.windSpeed = Integer.valueOf(elements[3]);
    }

    public String rateTemperature(){

        if(this.temp<55)
            return "cold";
        else if(this.temp<65)
            return "mild";
        else
            return "hot";
    }

    public String getTIme(){

        if(this.hour == 9)
            return this.day+" morning";
        else if(this.hour == 15)
            return this.day+" afternoon";
        else
            return this.day+" evening";
    }

    public static void main(String[] args) throws Throwable {

        System.out.println("current dir = ");
        BufferedReader br = Files.newBufferedReader(
                Paths.get(System.getProperty("user.dir")+"/data/weather.csvx"));
        Reading[] readings = new Reading[12];
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
            System.out.println(readings[i].getTIme()+" was "+readings[i].rateTemperature());
        }
    }
}
