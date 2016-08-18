package src.day9.CriterionFilter;

import java.util.function.Predicate;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class StringLengthThreshold implements Predicate<String> {

    int limit;

    public StringLengthThreshold(int limit)
    {
        this.limit = limit;
    }
    @Override
    public boolean test(String s) {
        if(s.length() > limit)
            return true;
        return false;
    }
}
