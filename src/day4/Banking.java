package src.day4;

/**
 * Created by vsanghav on 8/4/2016.
 */
public class Banking {

    public static void main(String[] args){

        Account[] accounts = new Account[3];

        accounts[0] = new MortgageAccount("Mr. Bankrupt", 100000);
        accounts[1] = new CheckingAccount("Mr. Broke", 200);
        accounts[2] = new CheckingAccount("Mr. Sad",1000);

        for(int i=0;i<3;i++){

            System.out.println("Transactions for Account "+ (i+1));
            accounts[i].deposit(1000);
            accounts[i].withdraw(500);
            accounts[i].withdraw(1000);
            accounts[i].withdraw(2000);
            System.out.println("----------------------------------------------------------------------------------");

        }


    }
}
