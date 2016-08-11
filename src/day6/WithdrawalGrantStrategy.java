package src.day6;

/**
 * Created by vsanghav on 8/11/2016.
 */
public interface WithdrawalGrantStrategy {

    public boolean isWithdrawAllowed(double balance, double txnAmount, double overdraft, int numOfTxn);
}
