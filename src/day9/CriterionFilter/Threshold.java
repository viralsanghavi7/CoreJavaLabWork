package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Threshold implements StringCriterion {

    int limit;

    public Threshold(int limit)
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
