package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Palindrome implements StringCriterion {
    @Override
    public boolean test(String s) {

        s = s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i))
                return false;
        }

        return true;
    }
}
