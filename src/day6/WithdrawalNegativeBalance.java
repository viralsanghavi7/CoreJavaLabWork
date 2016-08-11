package src.day6;

/**
 * Created by vsanghav on 8/11/2016.
 */
public class WithdrawalNegativeBalance implements WithdrawalGrantStrategy {
    @Override
    public boolean isWithdrawAllowed(double balance, double txnAmount, double overdraft, int numOfTxn) {
        if(txnAmount > balance+overdraft)
            return false;
        return true;
    }
}
