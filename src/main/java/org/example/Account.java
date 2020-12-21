package org.example;

/**
 * Dealing with account balances and interest calculations.
 */
public class Account {

    private static double
            assetInterestRate = 1.5,  // applied to positive balances / assets
            debtInterestRate = 15.0;   // applied to negative balances / debt

    private static int accountLimit = 10000;

    private double balance;


    /**
     * Zinssatz wird einmal auf den Kontostand angewandt
     */
    void applyInterest(){
        if(balance == 0){                                                   //Wenn kein Geld auf dem Konto ist passiert gar nichts

        }
        else if(balance >= 0){                                              //Für positven Kontostand wird assetIntrestRate gewählt
            double zinsMultiplikator = 1 + assetInterestRate/100;           //Zinsmultiplikator ist 1 + Zinssatz(in Prozent)/100   Für 5 Prozent wären das 1.05
            balance = balance * zinsMultiplikator;                          //Der neue Kontostand ist der alte Kontostand mal den Zinsmultiplikator
            //Bsp: 100 * 1.05 = 105         Das ist trivial
        }
        else if(balance <= 0){                                              //Für negativen Kontostand wird debtIntrestRate gewählt
            double zinsMultiplikator = 1 + debtInterestRate/100;
            balance = balance * zinsMultiplikator;
        }
    }


    /**
     * Zinssatz wird mehrmals auf den Kontostand angewandt
     * @param years = wie oft der Zinssatz angewandt wird
     */
    void applyInterest(int years){
            for(int i = 0; i < years; i++){
                applyInterest();                     //Ruft applyZinssatz() so oft auf wie years groß ist
            }
    }



    /*
    Die Getter, Setter und Constructoren wurden mit Ausnahme von setBalance und dem zweiten Constructor alle automatisch erzeugt
    Dafür ALT + EINFG drücken und
     */

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
        //return Math.round(balance * 10000.0) / 10000.0;       Rundet balance auf 4 Nachkommastellen, sieht dadurch besser aus aber die Tests sind nicht dafür ausgelegt
    }


    /**
     * Wenn der Betrag auf den der Kontostand gesetzt werden soll nicht größer als das Kontolimit ist wird der Kontostand auf den Wert von balance gesetzt,
     * ansonsten wird eine Fehlernachricht ausgegeben
     * @param balance Wert auf den der Kontostand gesetzt werden soll
     */
    public void setBalance(double balance) {
        if(balance > accountLimit) {
            System.out.println("Der Betrag liegt über dem erlaubten Limit von " + accountLimit + " für das Konto");
        } else{
            this.balance = balance;
        }
    }

    public static int getAccountLimit() {
        return accountLimit;
    }

    public static double getDebtInterestRate() {
        return debtInterestRate;
    }

    public static void setDebtInterestRate(double debtInterestRate) {
        Account.debtInterestRate = debtInterestRate;
    }

    public static double getAssetInterestRate() {
        return assetInterestRate;
    }

    public static void setAssetInterestRate(double assetInterestRate) {
        Account.assetInterestRate = assetInterestRate;
    }

    public static void setAccountLimit(int accountLimit) {
        Account.accountLimit = accountLimit;
    }
}
