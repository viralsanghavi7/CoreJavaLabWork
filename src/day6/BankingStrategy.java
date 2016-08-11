package src.day6;


/**
 * Created by vsanghav on 8/11/2016.
 */
public class BankingStrategy {

    public static void main(String[] args){

        Account happyAcct = new Account(500.0, 300.0, new WithdrawalTransactionLimit(), new ApplyFeesTransactionLimit());
        Account sadAcct = new Account(100.0, 100.0, new WithdrawalNegativeBalance(), new ApplyFeesNegativeBalance());

        happyAcct.withdraw(500);
        happyAcct.deposit(5000);
        happyAcct.withdraw(300);

        sadAcct.withdraw(300);
        sadAcct.deposit(200);
        sadAcct.withdraw(300);
    }
}
