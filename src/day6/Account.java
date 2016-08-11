package src.day6;

/**
 * Created by vsanghav on 8/11/2016.
 */
public class Account {

    private WithdrawalGrantStrategy withdrawalGrantStrategy;
    private ApplyFeesStrategy applyFeesStrategy;
    private double balance;
    private int txnCount;
    private double overdraft;

    public Account(double balance, double overdraft, WithdrawalGrantStrategy withdrawalGrantStrategy, ApplyFeesStrategy applyFeesStrategy){
            this.balance = balance;
            this.overdraft = overdraft;
            this.withdrawalGrantStrategy = withdrawalGrantStrategy;
            this.applyFeesStrategy = applyFeesStrategy;
    }

    public void deposit(double amount){
        System.out.println("Balance before transaction = "+ this.balance);
        this.balance = this.balance + amount;
        System.out.println("Balance after transaction = "+ this.balance);

    }
    public void withdraw(double amount){

        if(this.withdrawalGrantStrategy.isWithdrawAllowed(this.balance,amount,this.overdraft,this.txnCount)==true) {
            System.out.println("Transaction allowed: ");
            System.out.println("Fee applied: " + this.applyFeesStrategy.appliedFee(this.txnCount, this.balance));
            this.balance = this.balance - amount;
            System.out.println("New balance = " + this.balance);
        }else
            System.out.println("Transaction declined ");
    }


}
