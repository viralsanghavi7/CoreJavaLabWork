package src.day9.CriterionFilter;

import java.time.LocalDate;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class DateThreshold implements Criterion<LocalDate> {

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
