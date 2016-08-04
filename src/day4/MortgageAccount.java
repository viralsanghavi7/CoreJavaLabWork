package src.day4;

/**
 * Created by vsanghav on 8/4/2016.
 */
public class MortgageAccount extends Account {

    private long initialBorrowedAmount;
    private static final String INITIAL_BORROW_MESSAGE = "Initial Borrowed Amount";
    private static final String PAYMENT_MESSGE = "Mortgage Payment";


    public MortgageAccount(String holderName, long borrowedAmount){
        super(holderName);
        this.initialBorrowedAmount = borrowedAmount;
        transaction(INITIAL_BORROW_MESSAGE,-borrowedAmount);
    }

    @Override
    public boolean deposit(long amount) {
        transaction(PAYMENT_MESSGE,amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        System.out.println("Withdraw not allowed for mortgage account");
        return false;
    }
}
