package src.day9.CriterionFilter;

/**
 * Created by vsanghav on 8/16/2016.
 */
public class IntegerThreshold implements Criterion<Integer> {

    int num;
    public IntegerThreshold(int num){
        this.num = num;
    }

    @Override
    public boolean test(Integer s) {
        if((int)s > num)
            return true;
        return false;
    }
}
