package pond.duck;

/**
 * Created by Mihnea on 19.04.2017.
 */
public class BadDuckling { // will NOT learn to quack from father
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
//        duck.quack(); // DOES NOT COMPILE
        duck.makeNoise(); // WILL COMPILE
    }

    public static void main(String[] args) {
        BadDuckling duckling = new BadDuckling();
        duckling.makeNoise();
    }
}