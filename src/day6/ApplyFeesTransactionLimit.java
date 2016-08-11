package src.day6;

/**
 * Created by vsanghav on 8/11/2016.
 */
public class ApplyFeesTransactionLimit implements ApplyFeesStrategy{

    private static final double TRANSACTION_FEE = 25;
    @Override
    public double appliedFee(int numberOfTxn, double balance) {
        if(numberOfTxn > 1)
            return TRANSACTION_FEE;
        return 0;
    }
}
