package net.luramaya.accounts;

public class Giro extends BaseAcc {

    double withdrawLimit = 0;
    double negativeLimit = 0;

    public Giro(double withdrawLimit, double negativeLimit) {
        setInterest(0.02);
        this.withdrawLimit = withdrawLimit;
        this.negativeLimit = negativeLimit;
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if (amount <= withdrawLimit && balance - amount >= negativeLimit) {
            System.out.println("Es wurden erfolgreich" + amount + "€ abgehoben");
            super.withdraw(amount);
        } else if (negativeLimit >= balance - amount) {
            System.out.println("Vorgang konnte nicht abgeschlossen werden, da Sie broke sind.");
        } else if (amount >= withdrawLimit) {
            System.out.println("Vorgang konnte nicht abgeschlossen werden, da " + amount + withdrawLimit + "übersteigen würde.");
        } else {
            System.out.println("ERRORRRRR");
        }
    }
}
