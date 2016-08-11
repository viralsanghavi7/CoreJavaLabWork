package src.day6;

/**
 * Created by vsanghav on 8/11/2016.
 */
public class WithdrawalTransactionLimit implements WithdrawalGrantStrategy{
    @Override
    public boolean isWithdrawAllowed(double balance, double txnAmount, double overdraft, int numOfTxn) {
        if(numOfTxn < 1 && (balance+overdraft > txnAmount))
            return true;
        return false;
    }
}
