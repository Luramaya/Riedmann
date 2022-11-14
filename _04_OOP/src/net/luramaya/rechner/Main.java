package net.luramaya.rechner;

public class Main {
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        ScienceCalc scieni = new ScienceCalc();
        RootCalc groot = new RootCalc();

        System.out.println("Calci add:" + calci.add(3, 5));
        System.out.println("Calci sub:" + calci.substract(10, 5.6));
        System.out.println("Calci divide:" + calci.divide(100, 2));
        System.out.println("Calci multiply:" + calci.multiply(3, 4));
        System.out.println("scieni cos:" + scieni.cosinus(200));
        System.out.println("scieni sin:" + scieni.sinus(20));
        System.out.println("rooti squareroot:" + groot.squareRoot(250));
    }


}
