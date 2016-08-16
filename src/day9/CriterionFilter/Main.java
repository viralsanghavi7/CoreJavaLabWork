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
                "Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
        );
        List<String> longStrings = getLongStrings(ls,6);
        assert longStrings.size() == 3;
        assert longStrings.get(0).equals("William");
        assert longStrings.get(1).equals("Susannah");
        assert longStrings.get(2).equals("Orinoco");

        List<String> longStrings1 = getLongStrings(ls,3);
        assert longStrings1.size() == 6;

    }

    public static List<String> getLongStrings(List<String> ls, int threshold ){
        List<String> result = new ArrayList<>();

        for(String s:ls){
            if(s.length()>threshold)
                result.add(s);
        }
        return result;

    }
}
