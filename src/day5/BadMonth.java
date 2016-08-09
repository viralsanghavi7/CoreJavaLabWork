package src.day5;

/**
 * Created by vsanghav on 8/9/2016.
 */
public class BadMonth extends Exception {

    public BadMonth(Throwable cause){
        super(cause);
        System.out.println("Not a valid month");
    }
}
