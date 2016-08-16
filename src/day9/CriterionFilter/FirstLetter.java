package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class FirstLetter<T> implements Criterion<T> {

    @Override
    public boolean test(T t) {
        String s = (String) t;
        if(s.charAt(0) >= 'A' && s.charAt(0)< 'N')
            return true;
        return false;
    }
}
