package pond.duck;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class FatherDuck {
    private String noise = "quack";
    private void quack() {
        System.out.println(noise); // private access is OK
    }
    public void makeNoise() {
        quack(); // private access is ok
    }
}






