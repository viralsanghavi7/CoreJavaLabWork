package src.day9.CriterionFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Main {

    public static void main(String[] args){

        List<String> ls = Arrays.asList(
                "Nitin", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
        );

        StringCriterion firstLetter = new FirstLetter();
        StringCriterion threshold = new Threshold(6);
        StringCriterion palindrome = new Palindrome();


        assert stringFilter(ls,firstLetter).size() == 2;
        assert stringFilter(ls,threshold).size() == 3;
        assert stringFilter(ls,palindrome).size() == 1;



    }

/*    public static List<String> getLongStrings(List<String> ls, int threshold ){
        List<String> result = new ArrayList<>();

        for(String s:ls){
            if(s.length()>threshold)
                result.add(s);
        }
        return result;

    }*/


    public static List<String> stringFilter(List<String> ls, StringCriterion filter){
        List<String> result = new ArrayList<>();
        for(String s:ls){
            if(filter.test(s)==true)
                result.add(s);
        }

        return result;
    }
}
