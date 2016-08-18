package src.day9.CriterionFilter;

import java.util.function.Predicate;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class FirstLetter implements Predicate<String> {

    @Override
    public boolean test(String t) {
        String s = (String) t;
        if(s.charAt(0) >= 'A' && s.charAt(0)< 'N')
            return true;
        return false;
    }
}
