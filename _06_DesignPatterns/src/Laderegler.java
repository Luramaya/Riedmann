public class Laderegler  implements VoltageObserver{
    @Override
    public void inform() {
        System.out.println("Laderegler an");
    }
}
