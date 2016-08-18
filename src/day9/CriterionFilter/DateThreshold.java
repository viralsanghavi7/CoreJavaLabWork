package src.day9.CriterionFilter;

import java.time.LocalDate;
import java.util.function.Predicate;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class DateThreshold implements Predicate<LocalDate> {

    int day;

    public DateThreshold(int day)
    {
        this.day = day;
    }
    @Override
    public boolean test(LocalDate s) {
        if(s.getDayOfMonth()<day)
            return true;
        return false;
    }
}
