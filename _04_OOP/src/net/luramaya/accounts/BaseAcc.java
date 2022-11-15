package net.luramaya.accounts;

public class BaseAcc {
    private double balance = 0;

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    private double interest = 0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Kontostand: " + this.balance);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void theYearIsOver() {
        double earnedInterests = balance * interest;
        this.balance += this.balance * this.interest;
        System.out.println("Herzlichen GLückwunsch Sie haben " +  earnedInterests + " plus erzieht.");
    }
}
