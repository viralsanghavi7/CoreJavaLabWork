package src.day6;

/**
 * Created by vsanghav on 8/11/2016.
 */
public class ApplyFeesNegativeBalance implements ApplyFeesStrategy{
    private static final double NEGATIVE_BAL_FEE = 25;
    @Override
    public double appliedFee(int numberOfTxn, double balance) {
        if(balance < 0)
            return NEGATIVE_BAL_FEE;

        return 0;
    }
}
