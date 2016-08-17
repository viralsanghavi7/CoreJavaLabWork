package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class StringLengthThreshold implements Criterion<String> {

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
