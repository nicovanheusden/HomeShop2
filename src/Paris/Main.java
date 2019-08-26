package Paris;

public class Main {
    public static void main(String[] args) {
        Parisien segolene = new Parisien();

        Bus bus = new Bus();
        segolene.seDeplacer(bus);
        Taxi taxi = new Taxi();
        segolene.seDeplacer(taxi);
        MoyenDeLocomotion taxi2 = new Taxi();
        segolene.seDeplacer(taxi2);
    }
}
