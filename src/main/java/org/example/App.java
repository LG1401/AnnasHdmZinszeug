package org.example;


/**
 * Testing simple accounts
 *
 */
public class App {
    /**
     * @param args unused
     */
    public static void main(String[] args) {

        Account account = new Account(20.); // Create a new instance of class Account

        account.setBalance(100.);           // set account's balance
        System.out.println("Balance:" + account.getBalance()); // Display account's balance

        Account.setAssetInterestRate(1.0);       // Setting the global interest rate

        account.applyInterest(3);           // raise balance by three years compounded interest

        System.out.println("Balance:" + account.getBalance());  // Display account's balance again


        Account.setAssetInterestRate(15.);
        account.setBalance(-1000.);           // You owe me something!
        account.applyInterest(3);

        System.out.println("Balance:" + account.getBalance());  // Display account's balance again

        private repo du franzose


        account.setBalance(0.);           // You owe me something!
        account.applyInterest(3);

        System.out.println("Balance:" + account.getBalance());  // Display account's balance again


        account.setBalance(1000.);           // You owe me something!
        account.applyInterest(3);

        System.out.println("Balance:" + account.getBalance());  // Display account's balance again
    }
}
