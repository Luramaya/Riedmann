package net.luramaya.accounts;

public class Main {
    public static void main(String[] args) {
        SparefrohBuch sparbuch = new SparefrohBuch();
        GmeinerKredit kredite = new GmeinerKredit(sparbuch, 400, 150);
        Giro giroKonto = new Giro(400, -20);

        sparbuch.deposit(5000);
        sparbuch.deposit(400);
        sparbuch.withdraw(2900);

        kredite.monthlyPayment();
        kredite.deposit(200);
        kredite.withdraw(200);
        kredite.monthlyPayment();
        kredite.monthlyPayment();


        giroKonto.deposit(200);
        giroKonto.withdraw(300);
        giroKonto.deposit(200);
        giroKonto.withdraw(300);


    }
}
