public class Heizung implements VoltageObserver {

    @Override
    public void inform() {
        System.out.println("genug Strom, Heizung an");
    }
}