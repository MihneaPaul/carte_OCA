package pond.duck;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class MotherDuck {
    String noise = "quack"; // default/package access
    void quack() {
        System.out.println(noise); // default access is OK
    }
    private void makeNoise() {
        quack(); // default acces is OK
    }
}