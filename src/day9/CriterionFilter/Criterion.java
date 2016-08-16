package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public interface Criterion<T> {

    public boolean test(T s);
}
