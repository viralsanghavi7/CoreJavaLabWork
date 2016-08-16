package src.day9.CriterionFilter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Main {

    public static void main(String[] args){


        // --------------- for String ---------------------------//
        List<String> ls = Arrays.asList(
                "Nitin", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
        );
        Criterion palindrome = new Palindrome();
        Filter<String> stringFilter = new Filter<>();
        assert stringFilter.filter(ls,palindrome).size() == 1;

        // --------------- for Integer ---------------------------//
        List<Integer> li = Arrays.asList(5,50,34,67,101);
        Filter<Integer> integerFilter = new Filter<>();
        Criterion greaterThanInteger = new IntegerThreshold(5);
        assert integerFilter.filter(li,greaterThanInteger).size() == 4;


        // --------------- for LocalDate ---------------------------//
        List<LocalDate> ld = Arrays.asList(LocalDate.now(), LocalDate.now().minus(5, ChronoUnit.DAYS), LocalDate.now().plus(5,ChronoUnit.DAYS));
        Filter<LocalDate> dateFilter = new Filter<>();
        Criterion greaterThanDay = new DateThreshold(15);
        assert dateFilter.filter(ld,greaterThanDay).size() == 1;
    }
}
