public class Geschirrspueler implements VoltageObserver{

    @Override
    public void inform() {
        System.out.println("Geschirrspüler an");

    }
}
