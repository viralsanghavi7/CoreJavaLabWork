package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class FirstLetter implements Criterion<String> {

    @Override
    public boolean test(String t) {
        String s = (String) t;
        if(s.charAt(0) >= 'A' && s.charAt(0)< 'N')
            return true;
        return false;
    }
}
