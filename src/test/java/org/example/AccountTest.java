package org.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@SuppressWarnings({"UnusedDeclaration"})
public class AccountTest {

    /**
     * Testing account balance and interest calculations
     */
    @Test
    public void testBalanceInterest() {

        Account account = new Account(20.); // Create a new instance of class Account

        account.setBalance(100.);           // set account's balance
        Account.setAssetInterestRate(1.0);       // Setting the global interest rate
        account.applyInterest();            // raise balance by one year's interest.
        account.applyInterest(3);           // raise balance by three years compounded interest

        Assert.assertEquals(104.060401, account.getBalance(), 0.);

        account.setBalance(-1000.);           // You owe me something!
        account.applyInterest(3);

        Assert.assertEquals(-1520.8749999999998, account.getBalance(), 0.);
        account.setBalance(10000);

        Assert.assertEquals(10000, account.getBalance(), 0.);

        account.setBalance(10001); // Exceeding limit

        Assert.assertEquals("Exceeding the balance limit?", 10000, account.getBalance(), 0.);

    }
}
