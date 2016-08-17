package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Palindrome implements Criterion<String> {


    public boolean test(String t) {
        String s = t.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}
