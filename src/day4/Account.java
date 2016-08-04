package src.day4;

/**
 * Created by vsanghav on 8/4/2016.
 */
public abstract class Account {

    private long balance=0;
    private String holderName;

    public Account(){

    }

    public Account(String holderName){
        this.holderName = holderName;
    }

    public final void transaction(String message, long amount){

        System.out.println("------------------------ Transaction Start -------------------");
        System.out.println(holderName+"'s balance: ="+ balance);
        System.out.println(message);
        this.balance = this.balance + amount;
        System.out.println(holderName+"'s new balance: ="+ balance);
        System.out.println("------------------------ Transaction End -------------------");

    }


    public long getBalance(){
        return this.balance;
    }

    public abstract boolean deposit(long amount);

    public abstract boolean withdraw(long amount);
}
