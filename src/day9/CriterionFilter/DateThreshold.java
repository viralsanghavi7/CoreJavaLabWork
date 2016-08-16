package src.day9.CriterionFilter;

import java.time.LocalDate;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class DateThreshold<T> implements Criterion<T> {

    int day;

    public DateThreshold(int day)
    {
        this.day = day;
    }
    @Override
    public boolean test(T s) {
        LocalDate d = (LocalDate) s;

        if(d.getDayOfMonth()<day)
            return true;
        return false;
    }
}
