package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class StringThreshold<T> implements Criterion<T> {

    int limit;

    public StringThreshold(int limit)
    {
        this.limit = limit;
    }
    @Override
    public boolean test(T s) {
        String t = (String) s;
        if(t.length() > limit)
            return true;
        return false;
    }
}
