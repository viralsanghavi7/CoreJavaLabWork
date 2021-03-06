package src.day9.CriterionFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class Filter<T> {

    public List<T> filter(List<T> ls, Predicate filter){
        List<T> result = new ArrayList<>();
        for(T s:ls){
            if(filter.test(s)==true)
                result.add(s);
        }

        return result;
    }
}
