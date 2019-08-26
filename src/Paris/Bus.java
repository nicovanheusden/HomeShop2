package Paris;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplace(String adress) {
        System.out.println("Je suis un bus et je vais à " + adress);
    }
}
