package net.luramaya.accounts;

public class GmeinerKredit extends BaseAcc {

    double loan;
    double monthlyPayment;
    private BaseAcc connectedAccount;

    public GmeinerKredit(BaseAcc connectedAccount, double loan, double monthlyPayment) {
        this.loan = loan;
        this.connectedAccount = connectedAccount;
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public void deposit(double amount) {
        loan -= amount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("not possible");
    }

    public void monthlyPayment() {
        double connectedAccBalance = connectedAccount.getBalance();

        if (connectedAccBalance <= monthlyPayment) {
            System.out.println("Help Balance too low");
        } else if (loan == 0) {
            System.out.println("Congrats, Schulden abbezahlt.");
        } else if (loan <= monthlyPayment) {
            System.out.println("Congrats, Schulden abbezahlt.");
            loan -= loan;
            connectedAccount.withdraw(loan);
        } else {
            loan -= monthlyPayment;
            connectedAccount.withdraw(monthlyPayment);
        }
    }
}