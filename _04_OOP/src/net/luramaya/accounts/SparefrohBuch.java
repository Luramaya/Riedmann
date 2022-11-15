package net.luramaya.accounts;

public class SparefrohBuch extends BaseAcc{


    public SparefrohBuch(){
        setInterest(0.06);
    }
    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if (balance >= amount){
            System.out.println("Es wurden erfolgreich " + amount + " € abgehoben");
            super.withdraw(amount);

        }else{
            System.out.println("Vorgang konnte nicht abgeschlossen werden, da Sie broke sind.");
        }

    }


}
