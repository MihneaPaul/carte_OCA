package pond.swan;
import pond.duck.MotherDuck; // import another package

/**
 * Created by Mihnea on 19.04.2017.
 */
// NO ACCESS MODIFIERS - ONLY SAME PACKAGE
public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck(); // MotherDuck restricts acces to the pond.duck package
//        duck.quack(); // DOES NOT COMPILE
//        System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
