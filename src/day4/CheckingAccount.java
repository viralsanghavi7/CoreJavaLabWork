package src.day4;

/**
 * Created by vsanghav on 8/4/2016.
 */
public class CheckingAccount extends Account {

    private long overDraftAmount;
    private static final String WITHDRAWAL_MESSAGE = "Checking Withdrawal";
    private static final String DEPOSIT_MESSAGE = "Checking Deposit";

    public CheckingAccount(String holderName, long overDraftAmount){
        super(holderName);
        this.overDraftAmount = overDraftAmount;

    }


    @Override
    public boolean withdraw(long amount) {

        if(amount-this.getBalance()>this.overDraftAmount) {
            System.out.println("Not allowed: Going above over draft limit");
            return false;
        }
        else{
            transaction(WITHDRAWAL_MESSAGE, -amount);
            return true;
        }
    }

    @Override
    public boolean deposit(long amount) {
        transaction(DEPOSIT_MESSAGE,amount);
        return true;
    }
}
