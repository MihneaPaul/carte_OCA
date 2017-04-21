package pond.duck;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class GoodDuckling { // will learn to quack by copying his mother
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}